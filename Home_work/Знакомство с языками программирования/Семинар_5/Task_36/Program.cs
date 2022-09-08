//Задайте одномерный массив, заполненный случайными числами. 
// Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

int[] GetArray(int size, int minValue, int maxValue)
{
    int[] res = new int[size];

    for (int i = 0; i < size; i++)
    {
        res[i] = new Random().Next(minValue, maxValue + 1);
    }
    return res;
}

int NotEvenNumbers(int[] arr)
{
    int result = 0;
    for (int i = 1; i < arr.Length; i = i + 2)
    {
        result = result + arr[i];
    }
    return result;
}

int[] myArray = GetArray(6, 1, 9);
int num = NotEvenNumbers(myArray);
Console.Write(string.Join(" ", myArray));
Console.WriteLine($" -> {num}");