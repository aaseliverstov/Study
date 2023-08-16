/**
 * Класс автомобиль с наследованием абстрактного класса «Car» и подключением интерфейса «Заправочная станция».
 **/
public class BMW extends Car implements GasStation{

    @Override
    public void fueling() {
        System.out.println("Заправка топливом " + getTypeFuel() + " автомобиля " + getBrand() + " выполнена" );
    }

    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setTypeBody(String typeBody) {
        super.setTypeBody(typeBody);
    }

    @Override
    public void setNumWheels(int numWheels) {
        super.setNumWheels(numWheels);
    }

    @Override
    public String getTypeFuel() {
        return super.getTypeFuel();
    }

    @Override
    public void setTypeFuel(String typeFuel) {
        super.setTypeFuel(typeFuel);
    }

    @Override
    public void setTypeTransmission(String typeTransmission) {
        super.setTypeTransmission(typeTransmission);
    }

    @Override
    public void setEngineCapacity(float engineCapacity) {
        super.setEngineCapacity(engineCapacity);
    }
}
