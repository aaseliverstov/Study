import sqlite3
import view as v
import preparation as p
import view_Logger as log


def add_data(name):
    log.add_data_start()
    global conn, cur
    conn = sqlite3.connect(f'{name}.db')
    cur = conn.cursor()

    cur.execute(f"SELECT MAX(staffid) FROM staff; ")
    string = list(cur.fetchall())
    staffid = int(p.data_content_int(string))

    staffid += 1
    fname = v.enter_data('fname')
    lname = v.enter_data('lname')
    gender = v.enter_data('gender')
    date_of_birth = v.enter_data('date_of_birth')
    marital_status = v.enter_data('marital_status')
    address = v.enter_data('address')
    post = v.enter_data('post')

    add_data_tabel1(staffid, fname, lname, gender,
                    date_of_birth, marital_status, address, post)

    log.add_data_string(staffid, 'Staff')

    cur.execute(f"SELECT MAX(phoneid) FROM phone; ")
    string = list(cur.fetchall())
    phoneid = int(p.data_content_int(string))

    phoneid += 1
    phone = v.enter_data('phone')
    comment = v.enter_data('comment')

    add_data_tabel2(phoneid, staffid, phone, comment)

    log.add_data_string(phoneid, 'Phone')

    v.add_data()

    while True:
        temp = v.add_data_new_phone()
        if temp == '':
            v.error2()
        elif temp == 'no':
            cur.close()
            conn.close()
            log.all_exit_in_menu()
            return
        elif temp == 'yes':

            cur.execute(f"SELECT MAX(phoneid) FROM phone; ")
            string = list(cur.fetchall())
            phoneid = int(p.data_content_int(string))

            phoneid += 1
            phone = v.enter_data('phone')
            comment = v.enter_data('comment')

            add_data_tabel2(phoneid, staffid, phone, comment)
            log.add_data_string(phoneid, 'Phone')

            v.add_data()
        else:
            v.error2()
            log.add_data_error()


def add_data_tabel1(staffid, fname, lname, gender, date_of_birth, marital_status, address, post):
    staff_data = [
        (f'{staffid}', f'{fname}', f'{lname}', f'{gender}',
         f'{date_of_birth}', f'{marital_status}', f'{address}', f'{post}'),
    ]

    cur.executemany("INSERT INTO Staff VALUES(?, ?, ?, ?, ?, ?, ?, ?);", staff_data)
    conn.commit()


def add_data_tabel2(phoneid, staffid, phone, comment):
    phone_data = [
        (f'{phoneid}', f'{staffid}', f'{phone}', f'{comment}'),
    ]

    cur.executemany("INSERT INTO Phone VALUES(?, ?, ?, ?);", phone_data)
    conn.commit()
