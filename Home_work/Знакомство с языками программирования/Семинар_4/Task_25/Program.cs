// Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную 
//степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16

int Method(int a, int b)
{
    int count = b;
    int result = a;
    for (int i = 1; i < count; i++)
    {
        result = result * a;
    }
    return result;
}

Console.Write("Введите число А: ");
int A = int.Parse(Console.ReadLine());
Console.Write("Введите число B: ");
int B = int.Parse(Console.ReadLine());

Console.WriteLine($"{A}, {B} -> {Method(A, B)}");