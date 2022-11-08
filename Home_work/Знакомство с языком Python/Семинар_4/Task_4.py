# Задана натуральная степень k. Сформировать случайным образом список коэффициентов
# (значения от 0 до 100) многочлена и записать в файл многочлен степени k.
# Пример:
# k=2 => 2x^2 + 4x + 5 = 0 или x^2 + 5 = 0 или 10x = 0

from random import randint

k = int(input("Введите степень: "))
if k == 0:
    print('Степень не может быть равна нулю')
lst = []

for i in range(0, k-1):
    lst.append(f'{randint(0,100)}x^{k-i} + ')
lst.append(f'{randint(0,100)}x + ')
lst.append(f'{randint(0,100)}')
lst.append(' = 0')

with open('Home_work/Знакомство с языком Python/Семинар_4/file.txt', 'w') as data:
    data.write(str(''.join(lst)))
