// Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел 
// больше 0 ввёл пользователь(сначала пользователь вводит количество значений - M, 
// далее M-раз сами значения).
// 0, 7, 8, -2, -2 -> 2
// -1, -7, 567, 89, 223-> 3

int[] Numbers(int m)
{
    int[] numbers = new int[m];
    int count;
    for (int i = 0; i < m; i++)
    {
        count = i + 1;
        Console.Write($"Введите {count} число: ");
        numbers[i] = int.Parse(Console.ReadLine());
    }
    return numbers;
}

int PlusNumber(int[] array)
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] > 0) count++;
    }
    return count;
}

Console.Write("Введите количество значений: ");
int M = int.Parse(Console.ReadLine());
if (M > 0)
{
    Console.WriteLine($"Количество значение больше 0: {PlusNumber(Numbers(M))}");
}
else
{
    Console.WriteLine("Количество значений не может быть" +
                               " отрицательным или равно нулю, введите корректное" +
                               " значение.");
}


