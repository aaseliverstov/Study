//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        int listSize = 10;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            list.addFirst((int) (Math.random() * (100 - 1)));
        }
        System.out.println(list);

        LinkedList<Integer> listRevers = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            listRevers.addFirst(list.getFirst());
            list.removeFirst();
        }
        System.out.println(listRevers);
    }
}