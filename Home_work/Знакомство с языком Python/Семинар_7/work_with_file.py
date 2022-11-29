import glob
import random
import csv
import view as v
import work_with_strings as wws


def initializing_variable():
    global data_file, name_download_file, max_id
    
    data_file = ''
    name_download_file = ''
    max_id = ''
    
    return data_file


def search_file_and_download(name_file):
    if glob.glob(f'{name_file}.csv'):
        contain_data_file = read_file(name_file)
        v.contain_data_file_true()
        global name_download_file
        name_download_file = name_file
        return contain_data_file
    else:
        v.error_null_file_name()
        return search_file_and_download(v.print_enter())


def read_file(name_file):
    with open(f'{name_file}.csv', 'r') as data:
        temp = data.read().split()
        return temp


def print_file(temp):
    count = 0
    for i in temp:
        if i != 'phone_number':
            count += 1
        else:
            count += 1
            break

    count_num = 0
    global max_id

    for i in range(len(temp)):
        if count_num < count:
            v.print_file(temp[i])
            count_num += 1
        else:
            count_num = 1
            print()
            max_id = temp[i]
            v.print_file(temp[i])
    return


def check_new_file(name):
    if name == '':
        v.error_name_new_file()
        return name

    if glob.glob(f'{name}.csv'):
        v.file_already_exists()
        check_new_file(v.new_name())
    else:
        add_string_file(name, 'id first_name last_name birth_date work_place phone_number')
        v.creat_and_load_file()
        return name


def add_string_file(name, data_file):
    with open(f'{name}.csv', 'a', encoding='utf-8') as data:
        file_writer = csv.writer(data, delimiter=",", lineterminator="\r")
        file_writer.writerow([f'{data_file}'])
    return name


def generate_file(name):
    if name == '':
        v.error_name_new_file()
        return name
    if glob.glob(f'{name}.csv'):
        v.file_already_exists()
        generate_file(v.new_name())
    else:
        while True:
            count_string = v.print_generate_file()
            if count_string == '':
                v.error()
            elif int(count_string) < 1:
                v.error()
            else:
                break
        count_string_int = int(count_string)
        add_string_file(name, 'id first_name last_name birth_date work_place phone_number')
        for i in range(1, count_string_int+1):
            id = i
            first_name = (''.join(random.choices(
                'qwertyuiopasdfghjklzxcvbnm', k=random.randint(2, 10))))
            last_name = (''.join(random.choices(
                'qwertyuiopasdfghjklzxcvbnm', k=random.randint(2, 10))))
            birth_date_d = random.randint(1, 30)
            birth_date_m = random.randint(1, 12)
            birth_date_g = random.randint(1900, 2022)
            work_place = (''.join(random.choices(
                'qwertyuiopasdfghjklzxcvbnm', k=random.randint(2, 10))))
            phone_number = '+79'
            for i in range(1, 10):
                temp = str(random.randint(0, 9))
                phone_number += temp

            data = (f'{id} {first_name} {last_name} {birth_date_d}.{birth_date_m}.{birth_date_g} {work_place} {phone_number}')
            add_string_file(name, data)
        v.creat_and_load_file()
    return


def clear_file_csv(name_download_file):
    filename = (f'{name_download_file}.csv')
    f = open(filename, "w+")
    f.close()
    return


def write_change_in_file(name_download_file, contain_data_file):
    clear_file_csv(name_download_file)
    count_add = 0
    data = ''
    for i in range(len(list(contain_data_file))):
        if count_add < 6:
            data += str(contain_data_file[i])
            data += ' '
            count_add += 1
        else:
            add_string_file(name_download_file, data)
            data = ''
            data += str(contain_data_file[i])
            data += ' '
            count_add = 1
    add_string_file(name_download_file, data)
    contain_data_file = read_file(name_download_file)
    return contain_data_file
