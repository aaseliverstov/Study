// Задача 43. Напишите программу, которая найдёт точку пересечения двух прямых, 
// заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 
// задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)


double SearchX(double B1, double K1, double B2, double K2)
{
    double x = (B2 - B1) / (K1 - K2);
    return x;
}

double SearchY(double x, double K1, double B1)
{
    double y = K1 * x + B1;
    return y;
}

Console.Write("Введите значение b1: ");
double b1 = int.Parse(Console.ReadLine());
Console.Write("Введите значение k1: ");
double k1 = int.Parse(Console.ReadLine());
Console.Write("Введите значение b2: ");
double b2 = int.Parse(Console.ReadLine());
Console.Write("Введите значение k2: ");
double k2 = int.Parse(Console.ReadLine());
if (k1 == k2) Console.WriteLine("Введены одинаковые значения для k1 и k2," +
                             " отрезки будут параллельны");
else
{
    double x = SearchX(b1, k1, b2, k2);
    Console.WriteLine($"({x}, {SearchY(x, k1, b1)})");
}

