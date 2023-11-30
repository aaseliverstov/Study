//Создать свой Java Maven/Gradle проект;
//Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
//Можно добавить любые библиотеки которые считают необходимыми
//Результаты должны быть сохранены в HashMap (шаг цикла -> результат)
//Необходимо вывести статистику по результату - количество позитивных и негативных результатов, процент от общего
// количества шагов цикла.


package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int maxCountStep = 100;

        Map<Integer, String> hash = new HashMap<>();
        Random rnd = new Random();

        for (int i = 0; i < maxCountStep; i++) {
            int randomDoor = rnd.nextInt(3) + 1;
            int anyDoor = rnd.nextInt(3) + 1;

            if (randomDoor == anyDoor) {
                hash.put(i,"True");
            } else {
                hash.put(i, "False");
            }
        }

        int positive = Collections.frequency(new ArrayList<String>(hash.values()), "True");
        int negative = Collections.frequency(new ArrayList<String>(hash.values()), "False");

        System.out.println("Positive result: " + positive);
        System.out.println("Negative result: " + negative);
        System.out.println("Percentage of the total number of steps " + (double) positive / maxCountStep * 100 + "%");
    }
}