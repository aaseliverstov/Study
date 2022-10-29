# Задайте список из вещественных чисел. Напишите программу,
# которая найдёт разницу между максимальным и минимальным значением дробной части элементов.
# Пример:
# [1.1, 1.2, 3.1, 5, 10.01] => 0.2

list = [1.1, 1.2, 3.1, 5, 10.01]
min_number = list[1]
max_number = 0
for i in list:
    num = round(i % int(i), 2)
    if max_number < num:
        max_number = num
    elif min_number > num:
        min_number = num
result = max_number - min_number
print(f'{list} => {result}')
