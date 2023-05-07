# Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

def method_one():
    number = 10 - 'hello'
    print(number)


def method_two():
    with open(f'123.txt') as data:
        temp = data.readlines()
    print(temp)


def method_three():
    arr = [1, 2, 3]
    print(arr[3])


method_one()
method_two()
method_three()