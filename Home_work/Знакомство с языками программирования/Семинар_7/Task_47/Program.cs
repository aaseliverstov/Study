// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными 
// вещественными числами.

// m = 3, n = 4.

// 0,5 7 -2 -0,2
// 1 -3,3 8 -9,9
// 8 7,8 -7,1 9

double[,] GetArray(int m, int n)
{
    double[,] resultArray = new double[m, n];

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            resultArray[i, j] = new Random().NextDouble();
            resultArray[i, j] = resultArray[i, j] * 10;
        }
    }
    return resultArray;
}

void PrintArray(double[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]:f2} \t ");
        }
        Console.WriteLine();
    }
}

Console.WriteLine("Введите количество строк (m): ");
int m = int.Parse(Console.ReadLine());
Console.WriteLine("Введите количество столбцов (n): ");
int n = int.Parse(Console.ReadLine());

double[,] myArray = GetArray(m, n);
PrintArray(myArray);