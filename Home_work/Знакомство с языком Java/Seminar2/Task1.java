/* Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.Если значение null, то параметр не должен попадать в запрос.Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task1
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("txt.jsn");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String data = br.readLine();
        br.close();

        String str = data.substring(1, data.length() - 1);
        String[] dataArray = str.split(", ");

        StringBuilder newStr = new StringBuilder();
        newStr.append("select * from students where ");

        for (int i = 0; i < dataArray.length; i++)
        {
            String[] temp = dataArray[i].split(":");
            String tempNull = temp[1].replace("\"", "");
            if (!tempNull.equals("null"))
            {
                newStr.append(temp[0].replace("\"", ""));
                newStr.append(" = ");
                newStr.append(temp[1]);
                newStr.append(" and ");
            }
        }

        String result2 = newStr.toString();
        result2 = result2.substring(0, result2.length() - 4);

        System.out.println(result2);
    }
}
