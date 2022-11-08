# Задайте натуральное число N. Напишите программу, которая составит список простых множителей числа N.

N = int(input("Введите число: "))
list = []
d = 2
while True:
    if N % d == 0:
        list.append(d)
        N //= d
    else:
        d += 1
    if N == 1:
        break
print(list)
