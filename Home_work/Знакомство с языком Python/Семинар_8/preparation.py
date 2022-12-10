import view as v
import view_Logger as log


def name_db():
    name = v.name_db()
    if name == '':
        v.name_db_is_null()
        name = name_db()
    return name


def add_data():
    temp = v.print_add_data()
    if temp == '':
        v.error()
        temp = add_data()
    return temp


def data_description(cursor):
    description = list(cursor.description)
    temp_lst = []
    for i in range(len(description)):
        temp = list(description[i])
        temp_lst.append(temp[0])
    temp_lst = str(temp_lst)
    temp_lst = temp_lst.replace('[', '')
    temp_lst = temp_lst.replace(']', '')
    temp_lst = temp_lst.replace("'", "")
    print(temp_lst)
    return


def data_content(strings):
    if strings == []:
        v.data_not_found()
    else:
        for i in range(len(strings)):
            string = str(strings[i])
            string = string.replace('(', '')
            string = string.replace("'", '')
            string = string.replace(')', '')
            print(string)
    return


def data_content_int(strings):
    if strings == []:
        v.data_not_found()
    else:
        for i in range(len(strings)):
            string = str(strings[i])
            string = string.replace('(', '')
            string = string.replace("'", '')
            string = string.replace(')', '')
            string = string.replace(',', '')
            string = string.replace('[', '')
            string = string.replace(']', '')
    return string
