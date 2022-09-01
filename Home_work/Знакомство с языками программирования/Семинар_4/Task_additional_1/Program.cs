// Напишите функцию, которая принимает одно число - высоту елочки и рисует ее в консоли звездочками.

void Method(int num)
{
    for (int i = 1; i <= num; i++)
    {
    for (int j = 0; j < num - i; j++) Console.Write(" ");
    for (int k = 0; k < i * 2 - 1; k++) Console.Write("*");
    Console.WriteLine();
    }
}

Console.Write("Введите высоту елки: ");
int height = int.Parse(Console.ReadLine());

if (height < 2) Console.WriteLine("Введите число больше 1");
else Method(height);