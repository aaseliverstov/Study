// Напишите программу, которая использует Stream API для обработки списка чисел. Программа должна вывести на экран
// среднее значение всех четных чисел в списке.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, -3, 5, 8, 5, 10, 1, 0);
        System.out.println("Среднее значение всех четных чисел: " +
                list.stream()
                .filter(i -> i % 2 == 0)
                .toList()
                .stream()
                .mapToInt(a->a)
                .average().orElse(0));
    }
}
