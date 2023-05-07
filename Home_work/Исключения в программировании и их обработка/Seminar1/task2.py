# Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
# новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
# Если длины массивов не равны, необходимо как-то оповестить пользователя.


def difference(ar1, ar2):
    result_ar = []
    if len(ar1) != len(ar2):
        raise Exception("Длины массивов не равны")
    for i in ar1:
        result = i - ar2[ar1.index(i)]
        result_ar.append(result)
    return result_ar


arr1 = [5, 3, 4]
arr2 = [1, 2, 3]
result_arr = difference(arr1, arr2)
print(result_arr)