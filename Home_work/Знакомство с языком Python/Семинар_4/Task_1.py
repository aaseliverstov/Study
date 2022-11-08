# Вычислить число c заданной точностью d
# Пример:
# при d = 0.001, π = 3.142 10^(-1) ≤ d ≤10^(-10)

from decimal import Decimal

print(round(float(input('Введите число: ')), int(Decimal(input('Введите точность: ')).as_tuple().exponent*(-1))))

# print(Decimal(input('Введите число: ')).quantize(Decimal(input('Введите точность: '))))