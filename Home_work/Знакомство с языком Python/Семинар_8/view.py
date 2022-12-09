def menu():
    print('Меню:')
    print('1. Создать/открыть БД\n2. Просмотр данных\n3. Редактирование данных\n4. '
          'Добавление данных\n5. Удаление данных\n6. '
          'Просмотр лога\n7. Выход из программы')

def print_select():
    select_number = input("\nВыберите значение из меню: ")
    print()
    return select_number

def name_db():
    temp = input('Введите наименовани БД: ')
    return temp

def error_find_namedb(name):
    print('База данных с указанным именем не найдена.')
    temp = input(f'Создать БД с именем "{name}" (введите yes или no)?: ')
    return temp 

def error():
    print('Вы выбрали неверное значение')

def successfully_created_db():
    print('База данных успешно создана')

def successfully_open_db():
    print('База данных успешно открыта')

def name_db_is_null():
    print('Вы не ввели имя файла.')

def print_add_data():
    temp = input('Заполнить созданную БД данными, для примера (введите yes или no)?: ')
    return temp

def print_add_data_successfully():
    print('Данные успешно добавлены в БД')

def db_not_load():
    print('БД не загружена')

def data_not_found():
    print('Данные отсутствуют')

def error2():
    print('Вы ввели неверное значение, повторите ввод')

def id_staff():
    tmp = input('\nДля просмотра телефона сотрудника укажите id сотрудника или для выхода укажите "no":')
    return tmp

def number_staff():
    tmp = str(input('Введите номер строки для удаления: '))
    return tmp

def delete_successfull():
    print('Запись успешно удалена')

def menu_for_change():
    print('Список полей:')
    print('1. fname\n2. lname\n3. gender\n4. date_of_birth\n5. '
          + 'marital_status\n6. address\n7. post\n8. phone\n')

def update_successfull():
    print('Запись успешно обновлена')