import open_create_database as ocd
import view as v
import preparation as p
import select_data as sddb
import delete_data as ds
import edit_data as ed

def run():
    global cur
    cur = ''
    while True:
        v.menu()
        number = v.print_select()
        if number == '1':  # Создать/открыть БД
            name = p.name_db()
            cur = ocd.create_database(name)
        elif number == '2':  # Просмотр данных(вывод в консоль)
            if cur == '':
                v.db_not_load()
            else:
                sddb.select_data(name)
        elif number == '3':  # Редактирование данных
            if cur == '':
                v.db_not_load()
            else:
                ed.edit(name)
        elif number == '4':  # Добавление данных
            if cur == '':
                v.db_not_load()
            else:
                pass
        elif number == '5':  # Удаление данных
            if cur == '':
                v.db_not_load()
            else:
                ds.delete_data(name)
        elif number == '6':  # Просмотр лога(вывод в консоль)
            if cur == '':
                v.db_not_load()
            else:
                pass
        elif number == '7':  # Выход из программы
            exit()
        else:
            v.error()

        print()
