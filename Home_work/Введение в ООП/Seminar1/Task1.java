//Разработать иерархию классов персонажей описанных в таблице.
//Провести анализ(абстракция) полей необходимых данных и перенести общие в базовый класс.
//Так же в базовом классе переопределить метод toString для вывода подробной информации о персонаже.
//Описать удобный конструктор базового класса и классов наследников так, чтобы необходимые параметры передавались вызовом пустого конструктора класса наследника.
//В основном классе создать список и заполнить его экземплярами каждого нового класса. Вывести в консоль содержание списка переопределённым методом toString().
//*Создать список из 50 персонажей выбранных случайным числом и статический метод выбирающий из списка только элементы конкретного, переданного в параметре класса
//      и выводящий их описание в консоль!



import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<>();
        ReadHeroes("Crossbowman",CreateHeroes(heroes));
    }

    public static ArrayList CreateHeroes(ArrayList<String> heroes){
        String[] heroes_name = new String[50];
        for (int i = 1; i < 51; i++) {
            heroes_name[i-1] = "Player" + i;
        }

        for (int k = 0; k < 50; k++) {
            int number = randomInt(7);
            if (number == 0) {
                heroes.add(String.valueOf(new Crossbowman(heroes_name[k], "Crossbowman")));
            }
            else if (number == 1) {
                heroes.add(String.valueOf(new Farmer(heroes_name[k], "Farmer")));
            }
            else if (number == 2) {
                heroes.add(String.valueOf(new Mage(heroes_name[k], "Mage")));
            }
            else if (number == 3) {
                heroes.add(String.valueOf(new Monk(heroes_name[k], "Monk")));
            }
            else if (number == 4) {
                heroes.add(String.valueOf(new Rogue(heroes_name[k], "Rogue")));
            }
            else if (number == 5) {
                heroes.add(String.valueOf(new Sniper(heroes_name[k], "Sniper")));
            }
            else if (number == 6) {
                heroes.add(String.valueOf(new Spearman(heroes_name[k], "Spearman")));
            }
        }
        return heroes;
    }

    public static void ReadHeroes(String role, ArrayList<String> heroes){
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).contains(role)){
                System.out.println(heroes.get(i));
            }
        }
    }

    public static int randomInt(int num){
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int temp = randomNum.nextInt(num);
        return temp;
    }
}
