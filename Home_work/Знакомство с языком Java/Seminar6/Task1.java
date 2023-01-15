//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//        отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.*;

public class Task1 {
    public static void main(String[] args){
        Notebook notebook1 = new Notebook("Apple", "4", "256", "MacOS", "white");
        Notebook notebook2 = new Notebook("MSI", "16","512", "Windows", "black");
        Notebook notebook3 = new Notebook("Asus","8", "1000", "Windows", "grey");
        Notebook notebook4 = new Notebook("Samsung", "16","1000", "Windows", "grey");
        Notebook notebook5 = new Notebook("DEXP", "8","1000", "Linux", "black");
        Notebook notebook6 = new Notebook("Dell", "4", "512", "Windows", "black");
        Notebook notebook7 = new Notebook("Asus", "6","256", "Linux", "red");
        Notebook notebook8 = new Notebook("Lenovo", "32","1000", "Windows", "grey");
        Notebook notebook9 = new Notebook("Apple", "8","512", "MacOS", "black");
        Notebook notebook10 = new Notebook("Huawei", "4","1000", "Windows", "black");

        Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6, notebook7, notebook8, notebook9, notebook10));
        sort(criteria(), notebooks);
    }

    public static Map<String, String> criteria() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> result = new HashMap<>();

        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: \n 1 - Бренд ноутбука \n 2 - Объем оперативной памяти \n 3 - Объем постоянной памяти \n 4 - Операционная система \n 5 - Цвет \n");
            String key = scanner.nextLine();
            System.out.println("Введите значения для выбранного критерия: ");
            String value = scanner.nextLine();

            result.put(key, value);

            System.out.println("Выполнить поиск? (yes/no)");
            String question = scanner.nextLine();
            if (question.equals("yes")) {
                break;
            }
        }
        System.out.println("Выбранные значения: "+result);
        return result;
    }

    public static void sort(Map<String, String> criteria, Set<Notebook> notebooks) {

        Set<Notebook> temp = new HashSet<>(notebooks);
        for (Notebook notebook : notebooks) {

            for (Object pair : criteria.keySet()) {

                if (pair.equals("1") && !notebook.getBrand().equals(criteria.get(pair))) {
                    temp.remove(notebook);
                }
                for (Object pair1 : criteria.keySet()) {

                    if (pair1.equals("2") && !notebook.getRam().equals(criteria.get(pair1))) {
                        temp.remove(notebook);

                    }
                    for (Object pair2 : criteria.keySet()) {

                        if (pair2.equals("3") && !notebook.getHardDisk().equals(criteria.get(pair2))) {
                            temp.remove(notebook);

                        }
                        for (Object pair3 : criteria.keySet()) {

                            if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criteria.get(pair3))) {
                                temp.remove(notebook);

                            }
                            for (Object pair4 : criteria.keySet()) {

                                if (pair4.equals("5") && !notebook.getColour().equals(criteria.get(pair4))) {
                                    temp.remove(notebook);

                                }
                            }
                        }
                    }
                }
            }

        }
        if (temp.isEmpty()) {
            System.out.println("По указанным параметрам ничего не найдено!");
        } else {
            System.out.println("Результат поиска: " + temp.toString());
        }
    }
}
