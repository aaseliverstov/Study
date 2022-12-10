import logger as log

def add_data_start():
    log.logger('||Запущен функционал по добавлению данных в БД')

def add_data_string(staffid, db):
    log.logger(f'|||Добавлена строка id = {staffid} в таблицу {db}')

def add_data_error():
    log.logger(f'|||Ошибка ввода данных')



def controller_open_menu():
    log.logger('|Открыто главное меню')

def controller_exit():
    log.logger('|Выход из программы')

def controller_error():
    log.logger('|Ошибка ввода данных в главном меню')



def delete_data_start():
    log.logger('||Запущен функционал по удалению данных в БД')

def delete_data_error():
    log.logger('|||Ошибка ввода данных')

def delete_data_success():
    log.logger('|||Данные успешно удалены из БД')



def edit_data_start():
    log.logger('||Запущен функционал по изменению данных в БД')

def edit_data_error():
    log.logger('|||Ошибка ввода данных')

def edit_data_not_found():
    log.logger('|||Запрашиваемые данные ненайдены')

def edit_data_view_fields_staff():
    log.logger('|||Отобразили список меню таблици Staff')

def edit_data_field_for_edit(text):
    log.logger(f'|||Выбрано поле {text} для изменения')

def edit_data_field_updated(text):
    log.logger(f'|||Поле {text} успешно обновлено')

def edit_data_phone_found(text):
    log.logger(f'|||Найдено {text} телефонов сотрудника')

def edit_data_view_phone_strings():
    log.logger(f'|||Отображен список телефонов')



def open_create_database_start():
    log.logger('||Запущен функционал открытие/создание БД')

def open_create_database_found():
    log.logger('|||Запрашиваемая БД найдена')

def open_create_database_open():
    log.logger('|||Запрашиваемая БД открыта')

def open_create_database_not_found():
    log.logger('|||Запрашиваемая БД не найдена. Запрос на создание БД')

def open_create_database_create_yes():
    log.logger('|||Положительный ответ на создание БД. Запуск создания БД')

def open_create_database_created():
    log.logger('|||БД создана успешно')

def open_create_database_add_data():
    log.logger('|||Запрос на заполнение БД стандартными данными')

def open_create_database_add_data_success():
    log.logger('|||Положительный ответ на заполнение БД данными. БД заполнена данными успешно')

def open_create_database_add_data_unsuccess():
    log.logger('|||Отрицательный ответ на заполнение БД данными. Выход')

def open_create_database_error():
    log.logger('|||Ошибка ввода данных')

def open_create_database_no():
    log.logger('|||Отрицательный ответ на создание БД. Выход')

def open_create_database_restart():
    log.logger('||Перезапуск функционала - открытие/создание БД')



def select_data_start():
    log.logger('||Запущен функционал просмотра данных из БД')

def select_data_staff_view():
    log.logger('|||Успешно отображены данные по сотрудникам')

def select_data_phone():
    log.logger('|||Запрос на просмотр телефона сотрудника')

def select_data_phone_yes():
    log.logger('|||Положительный ответ на просмотр телефона сотрудника')

def select_data_phone_no():
    log.logger('|||Отрицательный ответ на просмотр телефона сотрудника')

def select_data_phone_view():
    log.logger('|||Успешно отображены данные телефонов сотрудника')


def logger_read_log():
    log.logger('||Запуск отображения лога в консоли')



def all_exit_in_menu():
    log.logger('||Выход в главное меню')

def all_data_error():
    log.logger('|||Ошибка ввода данных')
