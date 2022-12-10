import sqlite3
import view as v
import view_Logger as log
import preparation as p


def select_data(name):
    log.select_data_start()
    conn = sqlite3.connect(f'{name}.db')
    cur = conn.cursor()

    cursor = cur.execute("SELECT * FROM staff")
    p.data_description(cursor)

    strings = list(cur.fetchall())
    p.data_content(strings)
    log.select_data_staff_view()

    while True:
        log.select_data_phone()
        tmp = v.id_staff()
        print()
        if tmp == '':
            v.error2()
            log.all_data_error()
        elif tmp == 'no':
            log.select_data_phone_no()
            break
        else:
            log.select_data_phone_yes()
            cursor = cur.execute(f"SELECT * FROM phone where staffid = {tmp}")
            p.data_description(cursor)

            strings = list(cur.fetchall())
            p.data_content(strings)
            log.select_data_phone()
            break
    cur.close()
    conn.close()
    log.all_exit_in_menu()
    return cur
