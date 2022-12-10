import sqlite3
import view as v
import preparation as p
import view_Logger as log


def edit(name):
    log.edit_data_start()
    conn = sqlite3.connect(f'{name}.db')
    cur = conn.cursor()
    while True:
        id_string = str(v.id_string_for_edit())
        if id_string == '':
            v.error2()
            log.edit_data_error()
        else:
            id_string = int(id_string)
            cur.execute(f"SELECT count(*) FROM staff WHERE staffid='{id_string}' ")
            string = list(cur.fetchall())
            count = int(p.data_content_int(string))
            if count > 0:
                while True:
                    v.menu_for_change()
                    log.edit_data_view_fields_staff()
                    field = v.number_field_for_edit()
                    if field == '':
                        v.error2()
                        log.edit_data_error()
                    elif field == '1':  # fname
                        log.edit_data_field_for_edit('fname')
                        cur.execute(f"SELECT fname FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = p.data_content_int(one_result)
                        v.current_number(one_result)
                        fname = v.new_string()
                        cur.execute(f"UPDATE Staff SET fname = '{fname}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        log.edit_data_field_updated('fname')
                        return
                    elif field == '2':  # lname
                        log.edit_data_field_for_edit('lname')
                        cur.execute(f"SELECT lname FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = p.data_content_int(one_result)
                        v.current_number(one_result)
                        lname = v.new_string()
                        cur.execute(f"UPDATE Staff SET lname = '{lname}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        log.edit_data_field_updated('lname')
                        return
                    elif field == '3':  # gender
                        log.edit_data_field_for_edit('gender')
                        cur.execute(f"SELECT gender FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = p.data_content_int(one_result)
                        v.current_number(one_result)
                        gender = v.new_string()
                        cur.execute(f"UPDATE Staff SET gender = '{gender}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        log.edit_data_field_updated('gender')
                        return
                    elif field == '4':  # date_of_birth
                        log.edit_data_field_for_edit('date_of_birth')
                        cur.execute(f"SELECT date_of_birth FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = p.data_content_int(one_result)
                        v.current_number(one_result)
                        date_of_birth = v.new_string()
                        cur.execute(f"UPDATE Staff SET date_of_birth = '{date_of_birth}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        log.edit_data_field_updated('date_of_birth')
                        return
                    elif field == '5':  # marital_status
                        log.edit_data_field_for_edit('marital_status')
                        cur.execute(f"SELECT marital_status FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = p.data_content_int(one_result)
                        v.current_number(one_result)
                        marital_status = v.new_string()
                        cur.execute(f"UPDATE Staff SET marital_status = '{marital_status}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        log.edit_data_field_updated('marital_status')
                        return
                    elif field == '6':  # address
                        log.edit_data_field_for_edit('address')
                        cur.execute(f"SELECT address FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = p.data_content_int(one_result)
                        v.current_number(one_result)
                        address = v.new_string()
                        cur.execute(f"UPDATE Staff SET address = '{address}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        log.edit_data_field_updated('address')
                        return
                    elif field == '7':  # post
                        log.edit_data_field_for_edit('post')
                        cur.execute(f"SELECT post FROM Staff WHERE staffid='{id_string}';")
                        one_result = list(cur.fetchone())
                        one_result = p.data_content_int(one_result)
                        v.current_number(one_result)
                        post = v.new_string()
                        cur.execute(f"UPDATE Staff SET post = '{post}' WHERE staffid='{id_string}';")
                        conn.commit()
                        v.update_successfull()
                        log.edit_data_field_updated('post')
                        return
                    elif field == '8':  # phone
                        log.edit_data_field_for_edit('phone')
                        cur.execute(f"SELECT count(*) FROM Phone WHERE staffid='{id_string}' ")
                        string = list(cur.fetchall())
                        count_string_phone = int(p.data_content_int(string))

                        if count_string_phone > 0:
                            if count_string_phone == 1:
                                log.edit_data_phone_found(
                                    f'{count_string_phone}')
                                cur.execute(f"SELECT phone FROM Phone WHERE staffid='{id_string}';")
                                one_phone = list(cur.fetchone())
                                one_phone = p.data_content_int(one_phone)

                                cur.execute(f"SELECT comment FROM Phone WHERE staffid='{id_string}';")
                                one_comment = list(cur.fetchone())
                                one_comment = p.data_content_int(one_comment)

                                v.current_number(one_phone)
                                phone = v.new_string()

                                v.current_number(one_comment)
                                comment = v.new_string()

                                cur.execute(f"UPDATE Phone SET phone = '{phone}', comment = '{comment}' WHERE staffid='{id_string}';")
                                conn.commit()
                                v.update_successfull()
                                log.edit_data_field_updated('phone/comment')
                                return

                            elif count_string_phone > 1:
                                log.edit_data_phone_found(
                                    f'{count_string_phone}')
                                cursor = cur.execute(f"SELECT * FROM Phone WHERE staffid='{id_string}';")
                                p.data_description(cursor)
                                strings = list(cur.fetchall())
                                p.data_content(strings)
                                log.edit_data_view_phone_strings()
                                while True:
                                    number_string = v.number_field_for_edit()
                                    if number_string == '':
                                        v.error2()
                                        log.edit_data_error()
                                    else:
                                        cur.execute(f"SELECT phone FROM Phone WHERE phoneid='{number_string}' AND staffid='{id_string}';")
                                        one_phone = list(cur.fetchone())
                                        one_phone = p.data_content_int(
                                            one_phone)

                                        cur.execute(f"SELECT comment FROM Phone WHERE phoneid='{number_string}' AND staffid='{id_string}';")
                                        one_comment = list(cur.fetchone())
                                        one_comment = p.data_content_int(
                                            one_comment)

                                        v.current_number(one_phone)
                                        phone = v.new_string()

                                        v.current_number(one_comment)
                                        comment = v.new_string()

                                        cur.execute(f"UPDATE Phone SET phone = '{phone}', comment = '{comment}' WHERE phoneid='{number_string}' AND staffid='{id_string}';")
                                        conn.commit()
                                        v.update_successfull()
                                        log.edit_data_field_updated('phone/comment')
                                        return
                    else:
                        v.data_not_found()
                        log.edit_data_not_found()
                        break
            else:
                v.data_not_found()
                log.edit_data_not_found()
                break
    cur.close()
    conn.close()
    log.all_exit_in_menu()
