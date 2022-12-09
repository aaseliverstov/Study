from datetime import datetime


def view_log():
    with open(f'log.csv', 'r', encoding='utf-8') as data:
        temp = str(data.read())
        print(temp)


def logger(text):
    with open('log.csv', 'a', encoding='utf-8') as log:
        log.write(f'{datetime.now()} {text} \n')
