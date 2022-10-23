# 5 – Реализуйте алгоритм перемешивания списка.


import random

print("Первый вариант")

list = [1,2,3,4,5,6,7,8,9,10]
print(f'Оригинальный список: {list}')
random.shuffle(list)
print(f'Перемешанный список: {list}')




from random import randint

print("Второй вариант")

lst = [1,2,3,4,5,6,7,8,9,10]
print(f'Оригинальный список: {lst}')
temp = 0
tmp = []

while len(tmp) < len(lst):
    n = randint(0, 9)
    if n not in tmp:
        tmp.append(n)

for i in lst:
    temp = lst[i-1]
    lst[i-1] = lst[tmp[i-1]]
    lst[tmp[i-1]] = temp
print(f'Перемешанный список: {lst}')
