# Функции-редуцеры для списков: Напишите функцию-редуктор, которая принимает список строк и 
# возвращает строку, состоящую из объединенных элементов списка через запятую. 
# Например, для списка ["apple", "banana", "cherry"] результат должен быть 
# "apple, banana, cherry".


from functools import reduce


def concat_reducer(acc, value):
    return acc + ', ' + value

strings = ["apple", "banana", "cherry"]
result = reduce(concat_reducer, strings)
print(result)