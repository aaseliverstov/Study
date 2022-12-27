//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        sum(n);
        mult(n);
        scanner.close();
    }

    public static void sum(int n)
    {
        int result = 0;
        for (int i = 1; i <= n; i++)
        {
            result += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + "(включительно) = " + result);
    }

    public static void mult(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        System.out.println("Произведение чисел от 1 до " + n + "(включительно) = " + result);
    }
}