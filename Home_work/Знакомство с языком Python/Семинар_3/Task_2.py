# Напишите программу, которая найдёт произведение пар чисел списка.
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.
# Пример:
# [2, 3, 4, 5, 6] => [12, 15, 16];
# [2, 3, 5, 6] => [12, 15]

list = [2, 3, 4, 5, 6]
result_list = []
count = 0
len_list = len(list)-1
for i in list:
    if count < (len(list) / 2):
        result_list.append(list[count] * list[len_list - count])
    else:
        break
    count += 1
print(f'{list} => {result_list}')
