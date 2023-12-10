//Создайте абстрактный класс "Animal" с полями "name" и "age".
//Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
//Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
//Выведите на экран информацию о каждом объекте.
//Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.


import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {

        Animal[] animals = new Animal[]{
                new Dog("Jonn", 5, "Black", 25),
                new Cat("Bob", 10, "White", 10)
        };
        for (Animal animal : animals){
            System.out.println("Object: " + animal.getClass().getName()
                    + ", Name: " + animal.name
                    + ", Age: " + animal.age
                    + ", Color: " + animal.getClass().getMethod("getColor").invoke(animal)
                    + ", Weight: " + animal.getClass().getMethod("getWeight").invoke(animal));

            animal.getClass().getMethod("makeSound").invoke(animal);
        }
    }
}