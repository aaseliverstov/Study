//Вывести все простые числа от 1 до 1000
import java.util.ArrayList;
public class Task2 {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int var = 0;
        for (int i = 2; i < 1000; i++)
        {
            var = 1;
            for (int k = 2; k < i; k++)
            {
                if (i % k == 0)
                {
                    var = 0;
                    break;
                }
            }
            if (var == 1)
            {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
        }
    }

