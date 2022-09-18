// Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
// Например, даны 2 матрицы:
// 2 4 | 3 4
// 3 2 | 3 3
// Результирующая матрица будет:
// 18 20
// 15 18


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

int[,] SumArrays(int[,] array1, int[,] array2)
{
    int[,] resultArray = new int[array1.GetLength(0), array2.GetLength(1)];

    for (int i = 0; i < array1.GetLength(0); i++)
    {
        for (int j = 0; j < array2.GetLength(1); j++)
        {
            for (int k = 0; k < array2.GetLength(0); k++)
            {
                resultArray[i, j] += array1[i, k] * array2[k, j];
            }
        }
    }
    return resultArray;
}


Console.Write("Введите количество строк первой матрицы (m): ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите количество столбцов первой матрицы (n): ");
int n = int.Parse(Console.ReadLine());
Console.WriteLine();

Console.Write("Введите количество строк второй матрицы (a): ");
int a = int.Parse(Console.ReadLine());
Console.Write("Введите количество столбцов второй матрицы (b): ");
int b = int.Parse(Console.ReadLine());
Console.WriteLine();

if (m == b && n == a)
{

    int[,] myArray1 = GetArray(m, n);
    PrintArray(myArray1);
    Console.WriteLine();

    int[,] myArray2 = GetArray(a, b);
    PrintArray(myArray2);
    Console.WriteLine();

    int[,] resultArray = SumArrays(myArray1, myArray2);
    PrintArray(resultArray);
}
else Console.WriteLine("Перемножить матрицы указанных размеров нельзя."
                        + " Для перемножения матриц, их размеры должны соответствовать следующему правилу:"
                        + " размер строки 1 матрицы должен быть равен размеру столбца 2 матрицы и"
                        + " размер столбца 1 матрицы должен быть равен размеру строки 2 матрицы.");