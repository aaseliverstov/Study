# Задайте последовательность чисел. Напишите программу,
# которая выведет список неповторяющихся элементов исходной последовательности.

lst = [1, 1, 2, 3, 3, 4, 5, 6, 6, 7]
result_lst = []

for i in lst:
    temp = 0
    for k in lst:
        if i == k:
            temp += 1
    if temp < 2:
        result_lst.append(i)

print(f'{lst} -> {result_lst}')
