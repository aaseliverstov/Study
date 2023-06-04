package ru.hm.jcore.main;
import ru.hm.jcore.additional.Mult_class;
import ru.hm.jcore.additional.Sum_class;
import java.util.Scanner;

/**
 * Задача приложения: Вычислить n-ое треугольного числа(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 **/
public class Main {

    /**
     * Точка входа в программу.
     * @param args стандартные аргументы командной строки.
     **/
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число n: ");
//        int n = scanner.nextInt();
        int n = 8;
        System.out.println("Значение = " + n);

        Sum_class.sum(n);
        Mult_class.mult(n);
//        scanner.close();
    }
}





