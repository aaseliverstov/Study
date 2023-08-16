/**
 * Абстрактный класс «Car».
 **/
public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private String typeBody;
    private int numWheels;
    private String typeFuel;
    private String typeTransmission;
    private float engineCapacity;

    public void drive(){

    }
    public void service(){

    }
    public void gearshift(){

    }
    public void turningHeadlights(){

    }
    public void turningWipers(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public void setTypeTransmission(String typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
