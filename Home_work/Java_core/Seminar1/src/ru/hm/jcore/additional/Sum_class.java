package ru.hm.jcore.additional;

/**
 * Класс приложения, в котором произойдет рассчет суммы чисел от 1 до n
 * */
public class Sum_class {
    public static void sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + "(включительно) = " + result);
    }
}
