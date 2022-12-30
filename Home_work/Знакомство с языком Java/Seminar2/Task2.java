//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2
{
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        int array[] = new int[8];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rnd.nextInt(100);
        }

        Logger log = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("file.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        log.addHandler(fh);

        int tmp = 0;
        for (int i = array.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if (array[j] < array[j + 1])
                {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            log.info(Arrays.toString(array));
        }
    }
}