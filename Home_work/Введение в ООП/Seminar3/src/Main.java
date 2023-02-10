//Проделать код ревью своих работ! Оптимизиривать интерфейс так, чтобы в клиент коде было видно только публичные поля. Добавить поведение (метод step) для лучников.
//        1.Если стрел больше нуля заглушка выстрел и уменьшение количества стрел
//        2.Проверить есть ли крестьяне и свободны ли хоть один из них. Если да, то вернуть одну стрелу и сбросить флаг свободен у крестьянина.
//        3.Крестьяне должны уметь поднимать свой статус "свободен"
//        4.Сделать так, чтобы по нажатию Enter программа повторяла вывод на экран состояние персонажей и вызов метода step.

import Units.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesOne_sorted = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo_sorted = new ArrayList<>();

        CreateHeroes(heroesOne, 1);
        sort(heroesOne, heroesOne_sorted, "Units.Mage", "Units.Rogue", "Units.Sniper","Units.Farmer");
        CreateHeroes(heroesTwo, 2);
        sort(heroesTwo, heroesTwo_sorted, "Units.Monk", "Units.Crossbowman", "Units.Spearman","Units.Farmer");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Нажмите Enter для продолжения");
            String entry = sc.nextLine();
            if ("".equals(entry)) {
                heroesOne_sorted.forEach(n -> System.out.print(n.toString()));
                heroesOne_sorted.forEach(n -> n.step(heroesOne));
                System.out.println();
                System.out.println();
                heroesTwo_sorted.forEach(n -> System.out.print(n.toString()));
                heroesTwo_sorted.forEach(n -> n.step(heroesTwo));
            } else {
                return;
            }
        }
    }

    public static void CreateHeroes(ArrayList<BaseHero> heroes, int mode){
        String[] heroes_name = new String[20];
        for (int i = 1; i < 21; i++) {
            heroes_name[i-1] = "Player" + i;
        }
        if (mode == 1){
            for (int k = 0; k < 10; k++) {
                int number = randomInt(4);
                if (number == 0) {
                    heroes.add(new Farmer(heroes_name[k], "Units.Farmer"));
                }
                else if (number == 1) {
                    heroes.add(new Rogue(heroes_name[k], "Units.Rogue"));
                }
                else if (number == 2) {
                    heroes.add(new Sniper(heroes_name[k], "Units.Sniper"));
                }
                else if (number == 3) {
                    heroes.add(new Mage(heroes_name[k], "Units.Mage"));
                }
            }  
        } else if (mode == 2) {
            for (int k = 10; k < 20; k++) {
                int number = randomInt(4);
                if (number == 0) {
                    heroes.add(new Crossbowman(heroes_name[k], "Units.Crossbowman"));
                }
                else if (number == 1) {
                    heroes.add(new Monk(heroes_name[k], "Units.Monk"));
                }
                else if (number == 2) {
                    heroes.add(new Spearman(heroes_name[k], "Units.Spearman"));
                }
                else if (number == 3) {
                    heroes.add(new Farmer(heroes_name[k], "Units.Farmer"));
                }
            }  
        } 
    }

    public static int randomInt(int num){
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int temp = randomNum.nextInt(num);
        return temp;
    }

    public static void sort(ArrayList<BaseHero> list, ArrayList<BaseHero> sorted_list,  String role1, String role2, String role3, String role4){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRole().equals(role1)){
                sorted_list.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRole().equals(role2)){
                sorted_list.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRole().equals(role3)){
                sorted_list.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRole().equals(role4)){
                sorted_list.add(list.get(i));
            }
        }
    }
}