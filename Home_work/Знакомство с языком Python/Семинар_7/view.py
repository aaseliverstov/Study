def print_enter():
    name_file = input("Введите наименование файла с данными: ")
    return name_file


def error_null_file_name():
    print('\nФайл не найден.')


def print_select():
    select_number = input("\nВыберите значение из меню: ")
    print()
    return select_number


def error_number():
    print('\nВы выбрали неверное значение из меню')


def print_file(tmp1):
    print(tmp1, end=' ')
    return


def print_menu():
    print('Справочник:')


def contain_data_file_false():
    print('Файл не загружен.', end=' ')


def contain_data_file_true():
    print('\nФайл загружен')


def print_download_file():
    print('Для загрузки файла, выберите пункт 7 из меню.')


def menu():
    print('Меню:')
    print('1. Создать файл\n2. Просмотр файла\n3. Добавить данные в файл\n4. '
          'Изменить строку данных в файле\n5. Удалить строку данных из файла\n6. '
          'Сгенерировать справочник\n7. Загрузить файл\n8. Выход из программы')


def new_name():
    name = input('Введите имя файла для создания: ')
    return name


def file_already_exists():
    print('Файл с таким именем уже существует')


def creat_and_load_file():
    print('\nФайл успешно создан.\n'
          + 'Для загрузки файла воспользуйтесь пунктом меню №7')


def error_name_new_file():
    print('Вы не ввели новое имя файла!')


def print_generate_file():
    temp = input('Введите количество строк для генерации: ')
    return temp


def error_name_file():
    print('')


def error():
    print('Вы ввели не верное значение!')


def add_string_success():
    print('\nДанные добавлены успешно!')


def new_data_in_file_error():
    print('Ошибка, введены некорректные данные, повторите ввод!')


def first_name():
    first_name = input('Введите имя: ')
    return first_name


def last_name():
    last_name = input('Введите фамилию: ')
    return last_name


def birth_date_d():
    birth_date_d = int(input('Введите день рождения (только цифры): '))
    return birth_date_d


def birth_date_m():
    birth_date_m = int(input('Введите месяц рождения (только цифры): '))
    return birth_date_m


def birth_date_g():
    birth_date_g = int(input('Введите год рождения (только цифры): '))
    return birth_date_g


def work_place():
    work_place = input('Введите наименование компании: ')
    return work_place


def temp_phone_number():
    temp_phone_number = int(
        input('Введите номер телефона без плюса (только цифры): '))
    return temp_phone_number


def add_phone_number():
    add_phone_number = input(
        'Необходимо ли указать дополнительный номер? (yes или no): ')
    return add_phone_number


def del_string_success():
    print('Запись успешно удалена.')


def id_string_del():
    tmp = input('Введите id строки для удаления: ')
    return tmp


def id_string_chng():
    tmp = input('Введите id строки для изменения: ')
    return tmp


def id_string_err():
    print('Значение не введено.')

def chng_string_success():
    print('\nИзменения прошли успешно')


def id_string_not_found():
    print('id строки не найден.')


def string_chng():
    tmp = input('Укажите какое поле необходимо изменить: ')
    return tmp


def string_now(temp):
    print(f'Текущее значение: {temp}')


def new_string():
    tmp = input('Введите новое значение: ')
    return tmp


def menu_for_change():
    print('Список полей:')
    print('1. first_name\n2. last_name\n3. birth_date\n4. '
          + 'work_place\n5. phone_number\n')
