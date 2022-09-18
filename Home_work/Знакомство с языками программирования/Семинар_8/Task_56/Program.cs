// Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку 
// с наименьшей суммой элементов.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7

// Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка


int[,] GetArray(int m, int n)
{
    int[,] result = new int[m, n];

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(0, 10);
        }
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

int[,] FindMinSumAllElementsString(int[,] array)
{
    int minSumElementsString = 0;
    int indexString = 0;
    for (int k = 0; k < array.GetLength(1); k++)
    {
        minSumElementsString = minSumElementsString + array[0, k];
    }

    int temp = 0;
    for (int i = 1; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            temp = temp + array[i, j];
        }
        if (minSumElementsString > temp)
        {
            minSumElementsString = temp;
            indexString = i;
        }
        temp = 0;
    }

    int[,] newArray = new int[1, 2];
    newArray[0, 0] = minSumElementsString;
    newArray[0, 1] = indexString;
    return newArray;
}

Console.Write("Введите количество строк (m): ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите количество столбцов (n): ");
int n = int.Parse(Console.ReadLine());
Console.WriteLine();

int[,] myArray = GetArray(m, n);
PrintArray(myArray);
Console.WriteLine();

int[,] resultArray = FindMinSumAllElementsString(myArray);
Console.WriteLine($"Строка {resultArray[0, 1] + 1}, минимальная сумма {resultArray[0, 0]} ");
