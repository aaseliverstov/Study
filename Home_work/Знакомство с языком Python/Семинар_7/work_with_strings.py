import view as v
import work_with_file as wwf


def check_contain_data_file(contain_data_file):
    if contain_data_file == '':
        v.contain_data_file_false()
        v.print_download_file()
        return False
    else:
        return True


def new_data_in_file(name_download_file, contain_data_file):
    check = check_contain_data_file(contain_data_file)
    if check == True:
        while True:
            if wwf.max_id == '':
                id = 1
            else:
                id = int(wwf.max_id) + 1
                
            while True:
                first_name = v.first_name()
                if first_name.isalpha():
                    break
                else:
                    v.new_data_in_file_error()
            while True:
                last_name = v.last_name()
                if last_name.isalpha():
                    break
                else:
                    v.new_data_in_file_error()
            while True:
                birth_date_d = v.birth_date_d()
                if 0 < birth_date_d < 32:
                    break
                else:
                    v.new_data_in_file_error()
            while True:
                birth_date_m = v.birth_date_m()
                if 0 < birth_date_m < 13:
                    break
                else:
                    v.new_data_in_file_error()
            while True:
                birth_date_g = v.birth_date_g()
                if 1900 < birth_date_g < 2023:
                    break
                else:
                    v.new_data_in_file_error()

            work_place = v.work_place()
            work_place_temp = ''
            for i in range(len(work_place)):
                if work_place[i] != ' ':
                    work_place_temp += work_place[i]
                else:
                    work_place_temp += '|'
            work_place = work_place_temp

            phone_number = ''

            while True:
                temp_phone_number = v.temp_phone_number()
                if temp_phone_number > 0:
                    phone_number += '+'
                    phone_number += str(temp_phone_number)
                    vr = v.add_phone_number()
                    if vr == 'yes':
                        phone_number += '|'
                    elif vr == 'no':
                        break
                else:
                    v.new_data_in_file_error()

            data = (f'{id} {first_name} {last_name} {birth_date_d}.{birth_date_m}.{birth_date_g} {work_place} {phone_number}')
            wwf.add_string_file(name_download_file, data)
            contain_data_file = wwf.read_file(name_download_file)
            v.add_string_success()
            return contain_data_file
    else:
        return contain_data_file


def change_data_in_file(name_download_file, contain_data_file):
    check = check_contain_data_file(contain_data_file)
    temp_contain_data_file = list(contain_data_file)
    count = 0
    global count_change_string

    if check == True:
        inp = v.id_string_chng()
        if inp == '':
            v.id_string_err()
            return contain_data_file

        for i in range(len(list(temp_contain_data_file))-1):
            if temp_contain_data_file[i] == inp:
                count = i
                break

        if count == 0:
            v.id_string_not_found()
            return contain_data_file

        v.menu_for_change()

        while True:
            inp2 = v.string_chng()
            if inp2 == '1':
                while True:
                    v.string_now(temp_contain_data_file[count+1])
                    count_change_string = count + 1
                    new_inp = v.first_name()
                    if new_inp.isalpha():
                        contain_data_file[count_change_string] = new_inp
                        wwf.write_change_in_file(name_download_file, contain_data_file)
                        v.chng_string_success()
                        break
                    else:
                        v.new_data_in_file_error()
                break
            elif inp2 == '2':
                while True:
                    v.string_now(temp_contain_data_file[count+2])
                    count_change_string = count + 2
                    new_inp = v.last_name()
                    if new_inp.isalpha():
                        contain_data_file[count_change_string] = new_inp
                        wwf.write_change_in_file(name_download_file, contain_data_file)
                        v.chng_string_success()
                        break
                    else:
                        v.new_data_in_file_error()
                break
            elif inp2 == '3':
                while True:
                    v.string_now(temp_contain_data_file[count+3])
                    count_change_string = count + 3
                    new_inp = v.new_string()
                    new_inp_temp = ''
                    if new_inp != '':
                        for i in range(len(new_inp)):
                            if new_inp[i] != ' ':
                                new_inp_temp += new_inp[i]
                            else:
                                new_inp_temp += '.'
                        new_inp = new_inp_temp
                        contain_data_file[count_change_string] = new_inp
                        wwf.write_change_in_file(name_download_file, contain_data_file)
                        v.chng_string_success()
                        break
                    else:
                        v.new_data_in_file_error()
                break
            elif inp2 == '4':
                while True:
                    v.string_now(temp_contain_data_file[count+4])
                    count_change_string = count + 4
                    new_inp = v.work_place()
                    new_inp_temp = ''
                    if new_inp != '':
                        for i in range(len(new_inp)):
                            if new_inp[i] != ' ':
                                new_inp_temp += new_inp[i]
                            else:
                                new_inp_temp += '|'
                        new_inp = new_inp_temp
                        contain_data_file[count_change_string] = new_inp
                        wwf.write_change_in_file(name_download_file, contain_data_file)
                        v.chng_string_success()
                        break
                    else:
                        v.new_data_in_file_error()
                break
            elif inp2 == '5':
                while True:
                    v.string_now(temp_contain_data_file[count+5])
                    count_change_string = count + 5
                    new_inp = v.new_string()
                    new_inp_temp = ''
                    if new_inp != '':
                        for i in range(len(new_inp)):
                            if new_inp[i] != ' ':
                                new_inp_temp += new_inp[i]
                            else:
                                new_inp_temp += '|'
                        new_inp = new_inp_temp
                        contain_data_file[count_change_string] = new_inp
                        wwf.write_change_in_file(name_download_file, contain_data_file)
                        v.chng_string_success()
                        break
                    else:
                        v.new_data_in_file_error()
                break
            else:
                v.error_number()

    return contain_data_file


def del_data_in_file(name_download_file, contain_data_file):
    check = check_contain_data_file(contain_data_file)
    temp_contain_data_file = list(contain_data_file)
    count = 0

    if check == True:
        inp = v.id_string_del()

        for i in range(len(list(temp_contain_data_file))-1):
            if temp_contain_data_file[i] == inp:
                count = i
                break
        
        if count == 0:
            v.id_string_not_found()
            return contain_data_file

        for i in range(6):
            temp_contain_data_file.pop(count)

        contain_data_file = wwf.write_change_in_file(name_download_file, temp_contain_data_file)

        v.del_string_success()
        return contain_data_file
    else:
        return contain_data_file
