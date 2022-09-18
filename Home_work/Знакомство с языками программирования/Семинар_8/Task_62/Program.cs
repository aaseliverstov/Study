// Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07

int[,] GetSpiralArray(int m)
{
    int[,] result = new int[m, m];
    int num = 1;
    int i = 0;
    int j;

    for (int s = 0; s < m / 2; s++)
    {
        i += s;
        for (j = 0 + s; j < m - s; j++) result[i, j] = num++;

        j = m - 1 - s;
        for (i = i + 1 + s; i < m - s; i++) result[i, j] = num++;

        i = m - 1 - s;
        for (j -= 1 - s; j >= 0 + s; j--) result[i, j] = num++;

        if (num < m * m)
        {
            j = 0;
            for (i = 2; i > 0; i--) result[i, j] = num++;
        }
        else return result;
    }
    return result;
}

void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]}\t ");
        }
        Console.WriteLine();
    }
}

int[,] myArray = GetSpiralArray(4);
PrintArray(myArray);
