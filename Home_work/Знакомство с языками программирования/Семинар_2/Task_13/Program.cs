// Задача 13: Напишите программу, которая выводит третью цифру (справа налево) 
// заданного числа или сообщает, что третьей цифры нет.
// 645 -> 6
// 78 -> третьей цифры нет
// 32679 -> 6

Console.WriteLine("Введите число");
int num = int.Parse(Console.ReadLine());

if (num > 99 || num < -99)
{
    int result = (((num / 1000) * 10) - (num / 100));
    if (num > 0) result = result * -1;
    Console.WriteLine(result);
}
else
{
    Console.WriteLine("Третьей цифры нет");
}



