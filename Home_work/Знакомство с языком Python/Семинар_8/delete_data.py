import view as v
import sqlite3

def delete_data(name):
    while True:
        id_string = v.number_staff()
        if id_string == '':
            v.error2()
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
            return
        return