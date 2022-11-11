# Создайте программу для игры в "Крестики-нолики".

import random

def print_matrix():
    print()
    print('   1   2   3')
    print('   __|___|__')
    print(f' 1 {lst[0]} | {lst[1]} | {lst[2]} ')
    print('   __|___|__')
    print(f' 2 {lst[3]} | {lst[4]} | {lst[5]} ')
    print(f'   __|___|__')
    print(f' 3 {lst[6]} | {lst[7]} | {lst[8]} ')
    print()

def check_num(num, player_symbol):
    if num == '1,1' and lst[0] == ' ':
        lst[0] = player_symbol
    elif num == '1,2' and lst[1] == ' ':
        lst[1] = player_symbol
    elif num == '1,3' and lst[2] == ' ':
        lst[2] = player_symbol
    elif num == '2,1' and lst[3] == ' ':
        lst[3] = player_symbol
    elif num == '2,2' and lst[4] == ' ':
        lst[4] = player_symbol
    elif num == '2,3' and lst[5] == ' ':
        lst[5] = player_symbol
    elif num == '3,1' and lst[6] == ' ':
        lst[6] = player_symbol
    elif num == '3,2' and lst[7] == ' ':
        lst[7] = player_symbol
    elif num == '3,3' and lst[8] == ' ':
        lst[8] = player_symbol
    else:
        num = input('Вы ввели неверное значение ячейки или ячейка уже занята,\n ' +
                    'введите корректное значение ячейки через запятую (например 1,1): ')
        check_num(num, player_symbol)

def check_player(player):
    if player == 1:
        player = 2
    elif player == 2:
        player = 1
    return player

def check_finish(lst, count_step, player):
    if count_step > 4:
        if (lst[0] == lst[1] == lst[2]) and lst[0] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()
        elif (lst[3] == lst[4] == lst[5]) and lst[3] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()
        elif (lst[6] == lst[7] == lst[8]) and lst[6] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()
        elif (lst[0] == lst[3] == lst[6]) and lst[0] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()
        elif (lst[1] == lst[4] == lst[7]) and lst[1] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()
        elif (lst[2] == lst[5] == lst[8]) and lst[2] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()
        elif (lst[0] == lst[4] == lst[8]) and lst[0] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()
        elif (lst[2] == lst[4] == lst[6]) and lst[2] != ' ':
            print(f'!!! Побеждает Игрок {player} !!!')
            quit()

lst = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']
print(print_matrix())

count_step = 1
player_symbol_1 = 'x'
player_symbol_2 = 'o'
player = random.randint(1, 2)
for i in range(9):
    tmp = 0
    if player == 1:
        print(f'Шаг № {count_step}. Игрок {player}. Символ - {player_symbol_1}')
        num = input('Введите значение ячейки через запятую (например 1,1): ')
        check_num(num, player_symbol_1)
    elif player == 2:
        print(f'Шаг № {count_step}. Игрок {player}. Символ - {player_symbol_2}')
        num = input('Введите значение ячейки через запятую (например 1,1): ')
        check_num(num, player_symbol_2)

    print_matrix()
    check_finish(lst, count_step, player)
    count_step += 1
    player = check_player(player)
