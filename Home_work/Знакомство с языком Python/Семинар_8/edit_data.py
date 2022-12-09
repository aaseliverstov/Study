import sqlite3
import view as v
import select_data as sddb


def edit(name):
    conn = sqlite3.connect(f'{name}.db')
    cur = conn.cursor()
    while True:
        id_string = str(v.id_string_for_edit())
        if id_string == '':
            v.error2()
        else:
            id_string = int(id_string)
            cur.execute(f"SELECT count(*) FROM staff WHERE staffid='{id_string}' ")
            string = list(cur.fetchall())
            count = int(sddb.data_content_int(string))
            count = count
            if count > 0:
                while True:
                    v.menu_for_change()
                    field = v.number_field_for_edit()
                    if field == '':
                        v.error2()
                    elif field == '1':
                        cur.execute(f"SELECT fname FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = sddb.data_content_int(one_result)
                        v.current_number(one_result)
                        fname = v.new_string()
                        cur.execute(f"UPDATE Staff SET fname = '{fname}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        return
                    elif field == '2':
                        cur.execute(f"SELECT lname FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = sddb.data_content_int(one_result)
                        v.current_number(one_result)
                        lname = v.new_string()
                        cur.execute(f"UPDATE Staff SET lname = '{lname}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        return
                    elif field == '3':
                        cur.execute(f"SELECT gender FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = sddb.data_content_int(one_result)
                        v.current_number(one_result)
                        gender = v.new_string()
                        cur.execute(f"UPDATE Staff SET gender = '{gender}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        return
                    elif field == '4':
                        cur.execute(f"SELECT date_of_birth FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = sddb.data_content_int(one_result)
                        v.current_number(one_result)
                        date_of_birth = v.new_string()
                        cur.execute(f"UPDATE Staff SET date_of_birth = '{date_of_birth}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        return
                    elif field == '5':
                        cur.execute(f"SELECT marital_status FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = sddb.data_content_int(one_result)
                        v.current_number(one_result)
                        marital_status = v.new_string()
                        cur.execute(f"UPDATE Staff SET marital_status = '{marital_status}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        return
                    elif field == '6':
                        cur.execute(f"SELECT address FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = sddb.data_content_int(one_result)
                        v.current_number(one_result)
                        address = v.new_string()
                        cur.execute(f"UPDATE Staff SET address = '{address}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        return
                    elif field == '7':
                        cur.execute(f"SELECT post FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = sddb.data_content_int(one_result)
                        v.current_number(one_result)
                        post = v.new_string()
                        cur.execute(f"UPDATE Staff SET post = '{post}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        return
                    elif field == '8':
                        pass #phone

            else:
                v.data_not_found()
                break
    cur.close()
    conn.close()
