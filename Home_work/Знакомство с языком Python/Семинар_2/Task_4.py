# 4 – Задайте список из N элементов, заполненных числами из промежутка [-N, N]. 
# Найдите произведение элементов на указанных позициях. 
# Позиции хранятся в файле file.txt в одной строке одно число.

from random import randint
from importlib.resources import path


N = int(input("Введите число N: "))
lst = []
result = 0
for i in range(N):
    result = randint(-N, N)
    lst.insert(i-1, result)

lst2 = []
i = 0
sum = 1
with open('file.txt', 'r') as data:
    for line in data:
        if -N <= int(line) < N:
            lst2.insert(i, int(line))
        i+1
    for i in lst2:
        sum *= lst[i]

print(f'Произведение элементов массива {lst} согласно позиций из файла {lst2} '+ 
        f'равно {sum}')
