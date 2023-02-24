//Реализовать очерёдность ходов основываясь на скорости персонажа вне зависимости от комманды.
// Добавить магам возможность возрождать. Возрождённый персонаж может стать любым из доступных в комманде и займёт
// место убитого. После возрождения маг один ход пропускает.

import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> whiteSide_sorted;
    public static ArrayList<BaseHero> darkSide;
    public static ArrayList<BaseHero> darkSide_sorted;
    public static ArrayList<BaseHero> nextSteplist;

    public static void main(String[] args) {
        whiteSide = new ArrayList<>();
        whiteSide_sorted = new ArrayList<>();
        darkSide = new ArrayList<>();
        darkSide_sorted = new ArrayList<>();
        nextSteplist = new ArrayList<>();

        CreateHeroes(whiteSide, 1);
        sort(whiteSide, whiteSide_sorted, "Mage", "Rogue", "Sniper","Farmer");
        CreateHeroes(darkSide, 2);
        sort(darkSide, darkSide_sorted, "Monk", "Crossbowman", "Spearman","Farmer");

        Scanner sc = new Scanner(System.in);
        while (true){
            ConsoleView.view();
            nextStep(whiteSide_sorted,darkSide_sorted, nextSteplist);

            for (int i = 0; i < nextSteplist.size(); i++) {
                if (whiteSide_sorted.contains(nextSteplist.get(i))){
                    nextSteplist.get(i).step(whiteSide_sorted, darkSide_sorted);
                }else if (darkSide_sorted.contains(nextSteplist.get(i))){
                    nextSteplist.get(i).step(darkSide_sorted, whiteSide_sorted);
                }
            }
            sc.nextLine();
        }
    }

    public static void CreateHeroes(ArrayList<BaseHero> heroes, int mode){
        int x = 1;
        int y = 1;
        String[] heroes_name = new String[20];
        for (int i = 1; i < 21; i++) {
            heroes_name[i-1] = "Player" + i;
        }
        if (mode == 1){
            for (int k = 0; k < 10; k++) {
                int number = randomInt(4);
                if (number == 0) {
                    heroes.add(new Farmer(heroes_name[k], "Farmer", heroes, x, y++));
                }
                else if (number == 1) {
                    heroes.add(new Rogue(heroes_name[k], "Rogue", heroes, x, y++));
                }
                else if (number == 2) {
                    heroes.add(new Sniper(heroes_name[k], "Sniper", heroes, x, y++));
                }
                else if (number == 3) {
                    heroes.add(new Mage(heroes_name[k], "Mage", heroes, x, y++));
                }
            }  
        } else if (mode == 2) {
            x = GANG_SIZE;
            y = 1;
            for (int k = 10; k < 20; k++) {
                int number = randomInt(4);
                if (number == 0) {
                    heroes.add(new Crossbowman(heroes_name[k], "Crossbowman", heroes, x, y++));
                }
                else if (number == 1) {
                    heroes.add(new Monk(heroes_name[k], "Monk", heroes, x, y++));
                }
                else if (number == 2) {
                    heroes.add(new Spearman(heroes_name[k], "Spearman", heroes, x, y++));
                }
                else if (number == 3) {
                    heroes.add(new Farmer(heroes_name[k], "Farmer", heroes, x, y++));
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

    public static void nextStep(ArrayList<BaseHero> whiteSide, ArrayList<BaseHero> darkSide, ArrayList<BaseHero> nextSteplist){
        nextSteplist.clear();
        for (int i = 0; i < whiteSide.size(); i++) {
            if (whiteSide.get(i).getHealth() > 0){
                nextSteplist.add(whiteSide.get(i));
            }
        }
        for (int i = 0; i < darkSide.size(); i++) {
            if (darkSide.get(i).getHealth() > 0){
                nextSteplist.add(darkSide.get(i));
            }
        }
        nextSteplist.sort(Comparator.comparing(BaseHero::getSpeed,Comparator.reverseOrder()));
    }
}