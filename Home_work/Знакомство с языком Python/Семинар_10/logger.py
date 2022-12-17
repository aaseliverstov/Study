from datetime import datetime


def print_start(first_name,user_id,command):
    print(f'Пользователь: {first_name}, ID: {user_id}, запустил команду {command}')
    logger(f'Пользователь: {first_name}, ID: {user_id}, запустил команду {command}')

def print_result(first_name,user_id,result):
    print(f'Пользователь: {first_name}, ID: {user_id}, результат выполнения команды: {result}')
    logger(f'Пользователь: {first_name}, ID: {user_id}, результат выполнения команды: {result}')

def logger(text):
    with open('log.csv', 'a', encoding='utf-8') as log:
        log.write(f'{datetime.now()} {text} \n')