// Задача 10: Напишите программу, которая принимает на вход трёхзначное 
//число и на выходе показывает вторую цифру этого числа.
// 456 -> 5
// 782 -> 8
// 918 -> 1

Console.WriteLine("Введите трехзначное число");
int num = int.Parse(Console.ReadLine());
int result = (num / 10) - ((num / 100) * 10);

if (num > 99 && num < 1000)
{
    Console.WriteLine($"{num} -> {result}");
}
else if (num < -99 && num > -1000)
{
    result = result * -1;
    Console.WriteLine($"{num} -> {result}");
}
else
{
    Console.WriteLine("Введено не корректное число");
}
