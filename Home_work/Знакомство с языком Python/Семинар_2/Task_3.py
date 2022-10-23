# 3 – Задайте список из n чисел последовательности (1 + 1 / n) ** n и выведите на 
# экран их сумму.
# Пример:
# 1 -> 2.0
# 2 -> 4.25
# 3 -> 6.62037037037037

num = int(input("Введите число N: "))
result = 0
lst = []
for i in range(1,num+1):
    result = (1 + 1 / i) ** i
    # lst.insert(i-1, result)
    lst.append(result)
print(lst)

sum = 0
for i in lst:
    sum += i
print(f'{num} -> {sum}')


