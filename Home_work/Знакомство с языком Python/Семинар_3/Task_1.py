# Задайте список из нескольких чисел. Напишите программу,
# которая найдёт сумму элементов списка, стоящих на нечётной позиции.
# Пример:
# [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

# Вариант 1
list = [2, 3, 5, 9, 3]
sum = 0
count = 0
for i in list:
    if count % 2 == 1:
        sum += i
    count += 1
print(f'{list} -> {sum}')

# Вариант 2
list = [2, 3, 5, 9, 3]
sum = 0
for i in list[1::2]:
    sum += i
print(f'{list} -> {sum}')
