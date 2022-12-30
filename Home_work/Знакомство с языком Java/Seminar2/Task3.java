//Дана json строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task3
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("text.jsn");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String data = br.readLine();
        br.close();

        String str = data.substring(1, data.length() - 1);
        String[] dataArray = str.split(", ");
        String[][] dataArrayTemp = new String[dataArray.length][3];

        for (int i = 0; i < dataArray.length; i++)
        {
            str = dataArray[i].substring(1, dataArray[i].length() - 1);
            for (int j = 0; j < 3; j++)
            {
                String[] temp1 = str.split(",");
                String[] temp2 = temp1[j].split(":");
                dataArrayTemp[i][j] = temp2[1].substring(1, temp2[1].length() - 1);
            }
        }

        String[] result = new String[dataArrayTemp.length];
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < dataArrayTemp.length; i++)
        {
            newStr.append("Студент ");
            newStr.append(dataArrayTemp[i][0]);
            newStr.append(" получил ");
            newStr.append(dataArrayTemp[i][1]);
            newStr.append(" по предмету ");
            newStr.append(dataArrayTemp[i][2]);
            newStr.append(".");

            result[i] = newStr.toString();
            newStr.delete(0, newStr.length());
        }

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
