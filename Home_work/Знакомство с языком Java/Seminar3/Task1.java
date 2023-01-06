//Реализовать алгоритм сортировки слиянием


import java.util.Arrays;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {
        int array[] = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] arrayNew = new int[array.length];
        int[] result = sort(array, arrayNew, 0, array.length);

        System.out.println(Arrays.toString(result));
    }


    public static int[] sort(int[] array, int[] arrayNew, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return array;
        }
        else {
            int middle = startIndex + (endIndex - startIndex) / 2;
            int[] sort1 = sort(array, arrayNew, startIndex, middle);
            int[] sort2 = sort(array, arrayNew, middle, endIndex);

            int index = middle;
            int indexDestination = startIndex;
            int[] result = sort1 == array ? arrayNew : array;

            while (startIndex < middle && index < endIndex) {
                result[indexDestination++] = sort1[startIndex] < sort2[index] ? sort1[startIndex++] : sort2[index++];
            }
            while (startIndex < middle) {
                result[indexDestination++] = sort1[startIndex++];
            }
            while (index < endIndex) {
                result[indexDestination++] = sort2[index++];
            }
            return result;
        }
    }
}