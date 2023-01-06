//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100));
        }
        System.out.println(list.toString());

        int max = list.get(0), min = list.get(0);

        for (Integer i : list){
            if (max < i){
                max = i;
            }
        }

        for (Integer i : list){
            if (min > i){
                min = i;
            }
        }

        double sum = 0, middle = 0;

        for (Integer i : list) {
            sum += i;
        }

        middle = sum / list.size();

        System.out.printf("Минимальное: %d; ", min);
        System.out.printf("Максимальное: %d; ", max);
        System.out.printf("Среднее: %.1f; ", middle);
    }
}
