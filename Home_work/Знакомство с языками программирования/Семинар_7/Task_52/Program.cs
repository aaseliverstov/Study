// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом 
// столбце.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

int[,] GetArray(int m, int n)
{
    int[,] result = new int[m, n];

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(1, 100 + 1);
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
            Console.Write($"{array[i, j]} \t");
        }
        Console.WriteLine();
    }
}

void Average(int[,] array)
{
    Console.Write($"Среднеарифметическое по столбцам: ");

    for (int i = 0; i < array.GetLength(1); i++)
    {
        double average = 0;
        for (int j = 0; j < array.GetLength(0); j++)
        {
            average += (array[j, i]);
        }        
        Console.Write($"{average / array.GetLength(0)} ");
    }
}


Console.Write("Введите количество строк (m): ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите количество столбцов (n): ");
int n = int.Parse(Console.ReadLine());

int[,] myArray = GetArray(m, n);
Console.WriteLine();
PrintArray(myArray);
Console.WriteLine();
Average(myArray);
