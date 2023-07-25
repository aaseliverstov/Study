public class Main {
    public static void main(String[] args) {
        BMW car1 = new BMW();
        car1.setTypeFuel("Gasoline");

        BMW car2 = new BMW();
        car2.setTypeFuel("Diesel");

        car1.fueling(car1.getTypeFuel());
        car2.fueling(car2.getTypeFuel());
    }
}