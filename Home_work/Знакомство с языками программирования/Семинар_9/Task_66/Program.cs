// Задача 66: Задайте значения M и N. Напишите программу, которая 
// найдёт сумму натуральных элементов в промежутке от M до N.
// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

int NumberRec(int a, int b, int counter)
{
    if (b != counter) a += NumberRec(++a, --b, counter);
    return a;
}

Console.Write("Введите число m: ");
int M = int.Parse(Console.ReadLine());
Console.Write("Введите число n: ");
int N = Convert.ToInt32(Console.ReadLine());
if (M > 0 && N > 0)
{
    int counter = M;
    Console.WriteLine();
    Console.WriteLine(NumberRec(M, N, counter));
}
else Console.WriteLine("Ведите значения больше 0");