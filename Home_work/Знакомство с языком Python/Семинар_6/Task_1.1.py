# Напишите программу вычисления арифметического выражения заданного строкой. 
# Используйте операции +,-,/,*. приоритет операций стандартный.
# Пример:
# 2+2 => 4;
# 1+2*3 => 7;
# 1-2*3 => -5;

### написать калькулятор(парсер) должен принимать на вход выражение математическое и решать его (все в строке)


# Добавьте возможность использования скобок, меняющих приоритет операций.
# Пример:
# 1+2*3 => 7;
# (1+2)*3 => 9;

from decimal import Decimal
def check(inp):
    for i in range(len(inp)):
        if '/' in inp:
            inp = calculation(inp, '/')
        elif '*' in inp:
            inp = calculation(inp, '*')
        elif '+' in inp:
            inp = calculation(inp, '+')
        elif '-' in inp:
            inp = calculation(inp, '-')
    return inp

def calculation(input_str, symbol):
    num1 = 0
    num2 = 0
    temp = 0
    for i in input_str:
        if symbol in input_str:
            temp = input_str.index(symbol)
            num1 = Decimal(input_str[temp - 1])
            num2 = Decimal(input_str[temp + 1])
            
            if symbol == '/':
                result = num1 / num2
            elif symbol == '*':
                result = num1 * num2
            elif symbol == '+':
                result = num1 + num2
            elif symbol == '-':
                result = num1 - num2
            
            input_str[temp - 1] = str(result)
            input_str.pop(temp)
            input_str.pop(temp)
    return input_str


input = "(1+2)*3"
inp = [ ]
temp = ''
count = 0
for i in range(len(input)):
    if input[i] == '(':
        inp.append(input[i])
        count = 0
    elif input[i] == ')':
        inp.append(input[i])
        count = 0
    elif input[i] == '/':
        inp.append(input[i])
        count = 0
    elif input[i] == '*':
        inp.append(input[i])
        count = 0
    elif input[i] == '+':
        inp.append(input[i])
        count = 0
    elif input[i] == '-':
        inp.append(input[i])
        count = 0
    else:
        if count == 0:
            inp.append(input[i])
            count += 1
        elif count > 0:
            print(inp)
            temp = inp[len(inp)-1] + input[i]
            inp.pop()
            inp.append(temp)
            count += 1


temp1 = []
temp2 = []
temp4 = []

if '(' in inp:
    for i in range (len(inp) -1):
        if inp[i] == '(':
            temp1.append(i)
        elif inp[i] == ')':
            temp1.append(i)
    for i in range(temp1[0]+1,temp1[1]):
        temp2.append(inp[i])
    tem3 = list(check(temp2))
    for i in range(temp1[0]):
        temp4.append(inp[i])
    temp4.append(tem3[0])
    for i in range(temp1[1]+1, len(inp)):
        temp4.append(inp[i])
    tem5 = list(check(temp4))
    print(f'{input} => {Decimal(tem5[0])}')
else:     
    check(inp)
    print(f'{input} => {Decimal(inp[0])}')

