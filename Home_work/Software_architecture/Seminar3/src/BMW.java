public class BMW extends Car implements GasStation{

    @Override
    public void setBrand(String brand) {
        super.setBrand("BMW");
    }

    @Override
    public void setModel(String model) {
        super.setModel("x5");
    }

    @Override
    public void setColor(String color) {
        super.setColor("White");
    }

    @Override
    public void setTypeBody(String typeBody) {
        super.setTypeBody("Sedan");
    }

    @Override
    public void setNumWheels(int numWheels) {
        super.setNumWheels(4);
    }

    @Override
    public void setTypeFuel(String typeFuel) {
        super.setTypeFuel(typeFuel);
    }

    @Override
    public void setTypeTransmission(String typeTransmission) {
        super.setTypeTransmission("Variator");
    }

    @Override
    public void setEngineCapacity(float engineCapacity) {
        super.setEngineCapacity(2.2F);
    }

    @Override
    public void fueling(String fuel) {
        System.out.println("Заправка топливом " + fuel + " автомобиля выполнена");
    }
}
