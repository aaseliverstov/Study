//Напишите программу, которая принимает на вход пятизначное число и 
//проверяет, является ли оно палиндромом. Строки и массивы использовать 
//нельзя!
//14212 -> нет
//12821 -> да
//23432 -> да


Console.WriteLine("Введите число");
int number = int.Parse(Console.ReadLine());

// Первое решение

int x1 = number % 10;
int x2 = (number / 10) % 10;
int x3 = (number / 100) % 10;

int result = ((((((((x1 * 10) + x2) * 10) + x3) * 10) + x2) *10) + x1);

if(number == result)
{
    Console.WriteLine($"{number} -> да");
}
else
{
    Console.WriteLine($"{number} -> нет");
}

// Второе решение 

// int x1 = (number / 10000);
// int x2 = (number / 1000) % 10;
// int x4 = (number / 10) % 10;
// int x5 = number % 10;

// if(x1 == x5 && x2 == x4)
// {
//     Console.WriteLine($"{number} -> да");
// }
// else
// {
//     Console.WriteLine($"{number} -> нет");
// }