//Реализовать простой калькулятор

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args)
    {
        int num1 = number();
        String symbol = symbol();
        int num2 = number();
        
        int result = 0;

        switch(symbol)
        {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println(num1 + symbol + num2 + "=" + result);
    }

    public static int number()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num1 = scanner.nextInt();
        return num1;
    }
    public static String symbol()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sumbol (+,-,*,/): ");
        String z = scanner.nextLine();
        return z;
    }
}
