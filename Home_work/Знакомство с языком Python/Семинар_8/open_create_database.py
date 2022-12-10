import sqlite3
import glob
import view as v
import preparation as p
import view_Logger as log


def create_database(name):
    log.open_create_database_start()
    if glob.glob(f'{name}.db'):
        log.open_create_database_found()
        global conn
        conn = sqlite3.connect(f'{name}.db')
        cur = conn.cursor()
        v.successfully_open_db()
        log.open_create_database_open()
        cur.close()
        conn.close()
        return
    else:
        answer = v.error_find_namedb(name)
        log.open_create_database_not_found()
        if answer == 'yes':
            log.open_create_database_create_yes()
            conn = sqlite3.connect(f'{name}.db')
            cur = conn.cursor()
            create_db_structure_table1(cur)
            create_db_structure_table2(cur)
            v.successfully_created_db()
            log.open_create_database_created()
            while True:
                add_data = p.add_data()
                log.open_create_database_add_data()
                if add_data == 'yes':
                    add_data_tabel1(cur)
                    add_data_tabel2(cur)
                    v.print_add_data_successfully()
                    log.open_create_database_add_data_success()
                    return cur
                elif add_data == 'no':
                    log.open_create_database_add_data_unsuccess()
                    return cur
                else:
                    v.error
                    log.open_create_database_error()
        elif answer == 'no':
            log.open_create_database_no()
            return
        else:
            v.error()
            log.open_create_database_error()
            create_database(name)
            log.open_create_database_restart()


def create_db_structure_table1(cur):
    cur.execute("""CREATE TABLE IF NOT EXISTS Staff(
   staffid INT PRIMARY KEY,
   fname TEXT,
   lname TEXT,
   gender TEXT,
   date_of_birth TEXT,
   marital_status TEXT,
   address TEXT,
   post TEXT);
    """)
    conn.commit()


def create_db_structure_table2(cur):
    cur.execute("""CREATE TABLE IF NOT EXISTS Phone(
   phoneid INT PRIMARY KEY,
   staffid INT,
   phone TEXT,
   comment TEXT);
    """)
    conn.commit()


def add_data_tabel1(cur):
    staff = [
        ('1', 'Stephanie', 'Stewart', 'female', '01.02.1990',
         'married', 'khabarovsk karla-marksa 1', 'driver'),
        ('2', 'Sincere', 'Sherman', 'female', '10.02.1991',
         'married', 'moscov karla-marksa 1', 'driver'),
        ('3', 'Sidney', 'Horn', 'male', '01.03.1985', 'not married',
         'st petersberg karla-marksa 1', 'conductor'),
        ('4', 'Litzy', 'Yates', 'female', '11.05.1995',
         'not married', 'moscov karla-marksa 1', 'conductor'),
        ('5', 'Jaxon', 'Mills', 'male', '06.02.2000',
         'married', 'Novosibirsk karla-marksa 1', 'controller'),
        ('6', 'Paul', 'Richard', 'male', '02.04.1991',
         'married', 'Kazan karla-marksa 1', 'controller'),
        ('7', 'Kamari', 'Holden', 'female', '01.07.1990',
         'married', 'Chelyabinsk karla-marksa 1', 'engineer'),
        ('8', 'Gaige', 'Summers', 'female', '25.02.1992',
         'married', 'samara karla-marksa 1', 'engineer'),
        ('9', 'Andrea', 'Snow', 'female', '15.02.1998',
         'married', 'ufa karla-marksa 1', 'driver'),
        ('10', 'Angelica', 'Barnes', 'female', '02.09.1991',
         'married', 'omsk karla-marksa 1', 'driver')
    ]

    cur.executemany("INSERT INTO Staff VALUES(?, ?, ?, ?, ?, ?, ?, ?);", staff)
    conn.commit()


def add_data_tabel2(cur):
    phone = [
        ('1', '1', '89099999999', 'personal phone number'),
        ('2', '1', '89999999900', 'work phone number'),
        ('3', '2', '79344329922', 'personal phone number'),
        ('4', '3', '79246437478', 'personal phone number'),
        ('5', '4', '89233241232', 'work phone number'),
        ('6', '5', '79097463525', 'personal phone number'),
        ('7', '6', '89812736363', 'work phone number'),
        ('8', '7', '89246574737', 'personal phone number'),
        ('9', '8', '89993241423', 'personal phone number'),
        ('10', '9', '89996574379', 'personal phone number'),
        ('11', '10', '79098564736', 'personal phone number')
    ]

    cur.executemany("INSERT INTO Phone VALUES(?, ?, ?, ?);", phone)
    conn.commit()
