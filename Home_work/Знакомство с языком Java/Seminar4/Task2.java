//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        int listSize = 10;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            list.add((int) (Math.random() * (10 - 1)));
        }

        System.out.println("Очередь: " + list);
        int addElement = 11;
        System.out.println("Добавляемый элемент = " +  addElement + ", " + "очередь после добавления элемента: " + enqueue(list, addElement));
        System.out.println("Очередь после удаления элемента: " + dequeue(list));
        System.out.println("Первый элемент очереди: " + first(list));
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int element) {
        list.addLast(element);
        return list;
    }

    public static LinkedList<Integer> dequeue(LinkedList<Integer> list) {
        System.out.println("Удаляемый элемент = " +  list.pollFirst());
        return list;
    }

    public static int first(LinkedList<Integer> list) {
        int firstElement = list.getFirst();
        return firstElement;
    }
}
