/**
 * Задача: создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями,
 * имплементировать метод «Заправка топливом» интерфейса «Заправочная станция».
 * Реализовать заправку каждого автомобиля подходящим топливом.
 **/
public class Main {
    /**
     * Точка входа в программу.
     * @param args стандартные аргументы командной строки.
     **/
    public static void main(String[] args) {
        BMW car1 = new BMW();
        car1.setBrand("BMW");
        car1.setModel("x5");
        car1.setColor("White");
        car1.setTypeBody("Crossover");
        car1.setNumWheels(4);
        car1.setTypeFuel("Diesel");
        car1.setTypeTransmission("Variator");
        car1.setEngineCapacity(2.0F);

        BMW car2 = new BMW();
        car2.setBrand("Honda");
        car2.setModel("Accord");
        car2.setColor("Red");
        car2.setTypeBody("Sedan");
        car2.setNumWheels(4);
        car2.setTypeFuel("Gasoline");
        car2.setTypeTransmission("Variator");
        car2.setEngineCapacity(2.5F);

        car1.fueling();
        car2.fueling();
    }
}

