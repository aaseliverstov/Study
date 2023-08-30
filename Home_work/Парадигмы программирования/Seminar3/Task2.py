# ООП Концепции:
# Создайте класс Person, который имеет атрибуты name, age и метод introduce(), выводящий информацию о человеке.
# Создайте несколько объектов этого класса и вызовите метод introduce() для каждого из них.


class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self, n):
        print(f"{n} - Name: {self.name}, Age: {self.age}")


person1 = Person("Max", 20)
person2 = Person("Alex", 21)

person1.introduce("person1")
person2.introduce("person2")