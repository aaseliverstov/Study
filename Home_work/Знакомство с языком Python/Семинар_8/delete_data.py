import view as v
import sqlite3
import view_Logger as log


def delete_data(name):
    log.delete_data_start()
    while True:
        id_string = v.number_staff()
        if id_string == '':
            v.error2()
            log.delete_data_error()
        else:
            id_string = int(id_string)
            conn = sqlite3.connect(f'{name}.db')
            cur = conn.cursor()

            cur.execute(f"DELETE FROM Phone WHERE staffid='{id_string}';")
            cur.execute(f"DELETE FROM Staff WHERE staffid='{id_string}';")
            conn.commit()

            cur.close()
            conn.close()

            v.delete_successfull()
            log.delete_data_success()
            log.all_exit_in_menu()

            return
        return
