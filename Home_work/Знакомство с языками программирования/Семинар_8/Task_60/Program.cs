// Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, 
// которая будет построчно выводить массив, добавляя индексы каждого элемента.

// Массив размером 2 x 2 x 2

// 66(0,0,0) 25(0,1,0)
// 34(1,0,0) 41(1,1,0)
// 27(0,0,1) 90(0,1,1)
// 26(1,0,1) 55(1,1,1)

int[,,] GetArray(int m, int n, int k)
{
    int[,,] result = new int[m, n, k];
    int g = 10;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            for (int l = 0; l < k; l++)
            {
                if (g < 100)
                {
                    result[i, j, l] = g;
                    g++;
                }
            }
        }
    }
    return result;
}

void PrintArray(int[,,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int l = 0; l < array.GetLength(2); l++)
            {
                Console.Write($"{array[i, j, l]}\t ");
            }
        }
        Console.WriteLine();
    }
}

void PrintNumberAndIndexArray(int[,,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int l = 0; l < array.GetLength(2); l++)
            {
                Console.WriteLine($"{array[i, j, l]} ({i},{j},{l})");
            }
        }
    }
}

Console.Write("Введите количество строк (m): ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите количество столбцов (n): ");
int n = int.Parse(Console.ReadLine());
Console.Write("Введите количество слоев (k): ");
int k = int.Parse(Console.ReadLine());
Console.WriteLine();
if (((m * n * k) - 1) < 90)
{
    int[,,] myArray = GetArray(m, n, k);
    //PrintArray(myArray);
    PrintNumberAndIndexArray(myArray);
}
else Console.WriteLine("Дальнейшее заполнение массива двузначными неповторяющимися числами"
                        + " невозможен т.к. числа начнут повторятся.");



