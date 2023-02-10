//Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); Реализовать имнтерфейс в абстрактном классе. Создать два списка в классе main.
// В каждый из списков добавить по десять экземнляров наследников BaseHero. Крестьянин, Разбойник, Снайпер и Колдун могут быть в одном и Крестьянин Разбойник, копейщик, арбалетчик и
// монах в другой. Реализовать метод step() для магов таким образом, чтобы они могли лечить самого повреждённого из своих однополчан!) Удалить ненужные методы из абстрактного класса,
// если такие есть.


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();
        CreateHeroes(heroesOne, 1);
        CreateHeroes(heroesTwo, 2);

        heroesOne.forEach(n -> System.out.print(n.getInfo() + ", "));
        heroesOne.forEach(n -> n.step(heroesOne));
        System.out.println();
        System.out.println();
        heroesTwo.forEach(n -> System.out.print(n.getInfo() + ", "));
        heroesTwo.forEach(n -> n.step(heroesTwo));
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
                    heroes.add(new Farmer(heroes_name[k], "Farmer"));
                }
                else if (number == 1) {
                    heroes.add(new Rogue(heroes_name[k], "Rogue"));
                }
                else if (number == 2) {
                    heroes.add(new Sniper(heroes_name[k], "Sniper"));
                }
                else if (number == 3) {
                    heroes.add(new Mage(heroes_name[k], "Mage"));
                }
            }  
        } else if (mode == 2) {
            for (int k = 10; k < 20; k++) {
                int number = randomInt(4);
                if (number == 0) {
                    heroes.add(new Crossbowman(heroes_name[k], "Crossbowman"));
                }
                else if (number == 1) {
                    heroes.add(new Monk(heroes_name[k], "Monk"));
                }
                else if (number == 2) {
                    heroes.add(new Spearman(heroes_name[k], "Spearman"));
                }
                else if (number == 3) {
                    heroes.add(new Farmer(heroes_name[k], "Farmer"));
                }
            }  
        } 
    }

    public static int randomInt(int num){
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int temp = randomNum.nextInt(num);
        return temp;
    }
}