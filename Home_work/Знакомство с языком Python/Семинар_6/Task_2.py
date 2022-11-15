# Дана последовательность чисел. Получить список уникальных элементов заданной 
# последовательности, список повторяемых и убрать дубликаты из 
# заданной последовательности.

# Пример:
# [1, 2, 3, 5, 1, 5, 3, 10] => [2, 10] и [1, 3, 5] и [1, 2, 5, 3, 10]

lst = [1, 2, 3, 5, 1, 5, 3, 10]

lst_dupl = []
count = 0
for i in lst:
    for k in lst:
        if i == k:
            count += 1
    if count > 1 and i not in lst_dupl:
        lst_dupl.append(i)
    count = 0
        
lst_unic = []    
for x in lst:
    if x not in lst_dupl:
        lst_unic.append(x)

lst_2 = []
for x in lst:
    if x not in lst_2:
        lst_2.append(x)

print(f'{lst} => {lst_unic} и {lst_dupl} и {lst_2}')