import open_create_database as ocd
import view as v
import preparation as p
import select_data as sd
import delete_data as ds
import edit_data as ed
import add_data as ad
import view_Logger as log
import logger


def run():
    global cur
    cur = ''
    while True:
        v.menu()
        log.controller_open_menu()
        number = v.print_select()
        if number == '1':  # Создать/открыть БД
            name = p.name_db()
            cur = ocd.create_database(name)
        elif number == '2':  # Просмотр данных(вывод в консоль)
            if cur == '':
                v.db_not_load()
            else:
                sd.select_data(name)
        elif number == '3':  # Редактирование данных
            if cur == '':
                v.db_not_load()
            else:
                ed.edit(name)
        elif number == '4':  # Добавление данных
            if cur == '':
                v.db_not_load()
            else:
                ad.add_data(name)
        elif number == '5':  # Удаление данных
            if cur == '':
                v.db_not_load()
            else:
                ds.delete_data(name)
        elif number == '6':  # Просмотр лога(вывод в консоль)
            logger.view_log()
        elif number == '7':  # Выход из программы
            log.controller_exit()
            exit()
        else:
            v.error()
            log.controller_error()

        print()
