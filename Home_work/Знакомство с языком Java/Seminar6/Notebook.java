public class Notebook {
    private String brand;
    private String ram;
    private String hardDisk;
    private String operatingSystem;
    private String colour;

    public Notebook(String brand, String ram, String hardDisk, String operatingSystem, String colour) {
        this.brand = brand;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Notebook (brand: " + brand + ", ram: " + ram + ", hardDisk: " + hardDisk + ", operatingSystem: "
                + operatingSystem + ", colour: " + colour + ")";
    }


    public String getBrand() {
        return brand;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColour() {
        return colour;
    }
}
