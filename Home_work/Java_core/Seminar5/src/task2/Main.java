/* Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой, например,
состояния ячеек поля для игры в крестики-нолики, где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с
ноликом, 3 – резервное значение. Такое предположение позволит хранить в одном числе типа int всё поле 3х3. Записать
в файл 9 значений так, чтобы они заняли три байта. */

package task2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 2, 0, 2, 3, 2};
        try {
            OutputStream outputStream = new FileOutputStream("bin");
            for (int i = 0; i < 3; i++) {
                byte b = 0;
                for (int j = 0; j < 3; j++) {
                    b += array[3 * i + j] << (j * 2);
                }
                outputStream.write(b);
            }
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
