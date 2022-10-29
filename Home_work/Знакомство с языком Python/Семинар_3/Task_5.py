# Задайте число. Составьте список чисел Фибоначчи, 
# в том числе для отрицательных индексов.
# Пример:
# для k = 8 список будет выглядеть так:
# [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21]


k = int(input('Введите длину списка: '))
list = [1, 1]

for i in range(2, k):
    list.append(list[i-1] + list[i-2])

list2 = []
count = 0
list2.append(0)
for i in list:
    if count % 2 == 1:
        list2.append(i * -1)
    else:
        list2.append(i)
    count += 1

list2.reverse()
print(list2 + list)
