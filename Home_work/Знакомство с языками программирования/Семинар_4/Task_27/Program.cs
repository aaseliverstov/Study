// Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12

int Sum(int num)
{
    int a = 0;    
    int result = 0;

    while(num>0)
    {
        a = num % 10;
        num = num / 10;
        result = result + a; 
    }
    return result;
}

Console.Write("Введите число: ");
int number = int.Parse(Console.ReadLine());

Console.WriteLine($"{number} -> {Sum(number)}");