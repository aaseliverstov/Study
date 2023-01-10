//Реализовать алгоритм пирамидальной сортировки (HeapSort). (Можно использовать массивы)


import java.util.Arrays;

public class Task3 {

    public static void main(String args[]) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив рандомных значений: " + Arrays.toString(array));
        System.out.println("Пирамидальная сортировка: " + Arrays.toString(heapSort(array, array.length)));
    }

    static int[] heapSort(int[] array, int length) {
        int temp;
        int size = length-1;
        for (int i = (length / 2); i >= 0; i--) {
            heapify(array, i, size);
        }
        for(int i= size; i>=0; i--) {
            temp = array[0];
            array[0] = array[size];
            array[size] = temp;
            size--;
            heapify(array, 0, size);
        }
        return array;
    }
    static void heapify(int [] array, int i, int size) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largestChild = i;

        if (leftChild<= size && array[leftChild] > array[largestChild]) {
            largestChild = leftChild;
        }
        if (rightChild <= size && array[rightChild] > array[largestChild]) {
            largestChild = rightChild;
        }
        if (largestChild != i) {
            int temp = array[i];
            array[i] = array[largestChild];
            array[largestChild] = temp;
            heapify(array, largestChild, size);
        }
    }
}