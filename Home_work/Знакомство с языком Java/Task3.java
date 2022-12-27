import java.util.Scanner;

//Реализовать простой калькулятор
public class Task3 {
    public static void main(String[] args)
    {
        int num1 = number();
        String symbol = symbol();
        int num2 = number();

        char s1 = '+';


        if (symbol == s1)

        System.out.println(num1 + symbol + num2 + "=");


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

    public static String symbol()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sumbol (+,-,*,/): ");
        String z = scanner.nextLine();
        return z;
    }


}
