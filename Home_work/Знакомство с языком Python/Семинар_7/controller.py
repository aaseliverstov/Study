import view as v
import work_with_file as wwf
import work_with_strings as wws


def run():
    data_file = wwf.initializing_variable()
    while True:
        v.menu()
        number = v.print_select()

        if number == '1':  # Создать файл
            wwf.check_new_file(v.new_name())
        elif number == '2':  # Просмотр файла
            check = wws.check_contain_data_file(data_file)
            if check == True:
                v.print_menu()
                wwf.print_file(data_file)
                print()
        elif number == '3':  # Добавить данные в файл
            data_file = wws.new_data_in_file(wwf.name_download_file, data_file)
        elif number == '4':  # Изменить строку данных в файле
            data_file = wws.change_data_in_file(wwf.name_download_file, data_file)
        elif number == '5':  # Удалить строку данных из файла
            data_file = wws.del_data_in_file(wwf.name_download_file, data_file)
        elif number == '6':  # Сгенерировать справочник
            wwf.generate_file(v.new_name())
        elif number == '7':  # Выбрать новый файл
            data_file =  wwf.search_file_and_download(v.print_enter())
        elif number == '8':  # Выход из программы
            exit()
        else:
            v.error_number()

        print()
