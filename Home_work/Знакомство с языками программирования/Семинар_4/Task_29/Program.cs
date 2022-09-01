// Напишите программу, которая задаёт массив из N элементов, 
//заполненных случайными числами из [a, b) и выводит их на экран.
// 5, 0, 20 -> [1, 2, 5, 7, 19]
// 3, 1, 35 -> [6, 1, 33]

int[] Array(int n, int a, int b)
{
    int[] array = new int[n];
    for (int i = 0; i < array.Length; i++)
    {
        array [i] = new Random().Next(a, b);
    }
    return array;
}

Console.Write("Введите число N: ");
int N = int.Parse(Console.ReadLine());
Console.Write("Введите число A: ");
int A = int.Parse(Console.ReadLine());
Console.Write("Введите число B: ");
int B = int.Parse(Console.ReadLine());

Console.WriteLine(String.Join(", ", Array(N, A, B)));