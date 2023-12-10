// Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
// Обеспечьте поддержку сериализации для этого класса. Создайте объект класса Student и инициализируйте
// его данными. Сериализуйте этот объект в файл. Десериализуйте объект обратно в программу из файла.
// Выведите все поля объекта, включая GPA, и обсудите, почему значение GPA не было сохранено/восстановлено.


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Student student = new Student("Станислав", 20, 3.5);

        try(FileOutputStream fileOutputStream = new FileOutputStream("studentdata.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(student);
            System.out.println("Объект сериализован.");
        }

        try(FileInputStream fileInputStream = new FileInputStream("studentdata.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            student = (Student)objectInputStream.readObject();
            System.out.println("Объект десериализован.");
        }

        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний балл: " + student.getGPA());
        // Значение GPA не было сохранено/восстановлено всвязи с наличием в классе Student, для переменной GPA,
        // параметра transient, который исключает сериализацию для указанной переменной.
    }
}