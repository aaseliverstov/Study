public class Dog extends Animal{
    String color;
    int weight;

    public Dog(String name, int age, String color, int weight) {
        super(name, age);
        this.color = color;
        this.weight = weight;
    }

    public void makeSound(){
        System.out.println("Gav");
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
