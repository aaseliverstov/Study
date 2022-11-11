# Создайте программу для игры с конфетами человек против человека.

#  Условие задачи: На столе лежит 2021 конфета. Играют два игрока делая ход друг после друга.
# Первый ход определяется жеребьёвкой. За один ход можно забрать не более чем 28 конфет.
# Все конфеты оппонента достаются сделавшему последний ход. Сколько конфет нужно взять первому игроку,
# чтобы забрать все конфеты у своего конкурента?

#  a) Добавьте игру против бота
#  b) Подумайте как наделить бота "интеллектом"

import random

print('Условие задачи: На столе лежит 2021 конфета. Играют два игрока делая ход друг после друга.\n' +
      'Первый ход определяется жеребьёвкой. За один ход можно забрать не более чем 28 конфет.\n' +
      'Все конфеты оппонента достаются сделавшему последний ход.')
print()

def check_player(player):
    if player == 1 and persons == 1:
        player = 2
    elif player == 2 and persons == 1:
        player = 1
    elif player == 1 and persons == 2:
        player = 'бот'
    elif player == 'бот' and persons == 2:
        player = 1
    return player

candy = 2021
count_step = 1
player_1_candy = 0
player_2_candy = 0
min_candy = 1
max_candy = 28
player = 0

persons = int(input('Необходимо выбрать с кем будем играть:\n' + 
'1. С человеком (введите значение 1)\n' +  
'2. С ботом (введите число 2)\n' +
'Введите число: '))

if persons < 1 or persons > 2:
    print('Вы ввели неверное значение, начните сначала.')
else:
    player = random.randint(1, 2)
    if persons == 2 and player == 2:
        player = 'бот'

    while candy > 0:
        tmp = 0
        print()
        if player == 'бот':
            if candy <= max_candy:
                tmp = candy
            else:
                tmp = random.randint(1,28)
            
            print(f'Шаг № {count_step}. Игрок {player} выбрал конфет: {tmp}')
            candy -= tmp

            if player == 1:
                player_1_candy += tmp
            elif player == 2 or player == 'бот':
                player_2_candy += tmp

            print(f'Статистика: Игрок 1 взял конфет: {player_1_candy}, Игрок 2 взял конфет: {player_2_candy}, Осталось конфет: {candy}.')
                
            if candy == 0:
                print()
                print(f'!!! Побеждает Игрок {player} и забирает все конфеты !!!')
                
            count_step += 1
            player = check_player(player)
            
        else:
            tmp = int(input(f'Шаг № {count_step}. Игрок {player}. Выберите количество конфет: '))

            if tmp > candy:
                print(f'Нельзя взять конфет больше чем осталось {candy}, Вы берете {candy} конфет.')
                tmp = candy

            if tmp < int(min_candy):
                print(
                    f'Нельзя взять конфет меньше {min_candy}, Вы берете {min_candy} конфет.')
                tmp = min_candy
            elif tmp > int(max_candy):
                print(
                    f'Нельзя взять конфет больше {max_candy}, Вы берете {max_candy} конфет.')
                tmp = max_candy

            candy -= tmp

            if player == 1:
                player_1_candy += tmp
            elif player == 2 or player == 'бот':
                player_2_candy += tmp

            print(f'Статистика: Игрок 1 взял конфет: {player_1_candy}, Игрок 2 взял конфет: {player_2_candy}, Осталось конфет: {candy}.')
            
            if candy == 0:
                print()
                print(f'!!! Побеждает Игрок {player} и забирает все конфеты !!!')
            
            count_step += 1
            player = check_player(player)
