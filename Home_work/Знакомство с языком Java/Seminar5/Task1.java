//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите:\n all - показать всю телефонную книгу, \n find - найти контакт, \n exit - выйти");
            String scan = scanner.nextLine();

            if (scan.equals("exit")) {
                break;
            } else {
                switch (scan) {
                    case "all":
                        System.out.println(phonBook());
                        break;
                    case "find":
                        System.out.println("Введите имя: ");
                        String name = scanner.nextLine();
                        System.out.println(phonBook().get(name));
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static Map<String, List<String>> phonBook(){
        Map<String, List<String>> phonBook = new HashMap<>();
        phonBook.put("Александр", List.of("89141234567", "89262222299"));
        phonBook.put("Виктор", List.of("89263333355"));
        phonBook.put("Игорь", List.of("89263333366"));
        phonBook.put("Иван", List.of("89263333377", "89262222211"));
        return phonBook;
    }
}
