// Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным 
// элементов массива.
// [3 7 22 2 78] -> 76

double[] GetDoubleArray(int size)
{
    double[] res = new double[size];

    for (int i = 0; i < size; i++)
    {
        res[i] = new Random().NextDouble();
        res[i] = res[i] * 100;
    }
    return res;
}

double MinNumb(double[] arr, int size)
{
    double min = arr[0];
    for (int i = 1; i < size; i++)
    {
        if (min < arr[i]);
        else min = arr[i];
    }
    return min;
}

double MaxNumb(double[] arr, int size)
{
    double max = arr[0];
    for (int i = 1; i < size; i++)
    {
        if (max > arr[i]);
        else max = arr[i];
    }
    return max;
}

double Difference (double max, double min)
{
    double difference;
    difference = max - min;
    return difference;
}

double[] myArray = GetDoubleArray(6);
Console.WriteLine(string.Join(" ", myArray));

double minNumber = MinNumb(myArray, 6);
Console.WriteLine($"Минимальное значение: {minNumber}");

double maxNumber = MaxNumb(myArray, 6);
Console.WriteLine($"Максимальное значение: {maxNumber}");

double diffNumber = Difference(maxNumber, minNumber);
Console.WriteLine($"Разница: {diffNumber}");
