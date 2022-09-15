// Задача 50. Напишите программу, которая на вход принимает число и генерирует 
// случайный двумерный массив, и возвращает индексы этого элемента или же указание, 
// что такого элемента нет.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4

// 17 -> такого числа в массиве нет

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

void SearchNumberInArray(int [,] array, int num)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            if(array[i, j] == num) 
            {
                Console.WriteLine($"Указанное число найдено под индексом - ({i},{j})");
                return;
            }
        }
    }
    Console.WriteLine("Указанного числа нет в массиве");
}

Console.Write("Введите количество строк (m): ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите количество столбцов (n): ");
int n = int.Parse(Console.ReadLine());
Console.Write("Введите число которое необходимо найти в массиве: ");
int number = int.Parse(Console.ReadLine());

int[,] myArray = GetArray(m, n);
Console.WriteLine();
PrintArray(myArray);
Console.WriteLine();
SearchNumberInArray(myArray, number);
