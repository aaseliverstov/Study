package ru.hm.jcore.additional;

/**
 * Класс приложения, в котором произойдет рассчет произведения чисел от 1 до n
 * */
public class Mult_class {
    public static void mult(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Произведение чисел от 1 до " + n + "(включительно) = " + result);
    }
}
