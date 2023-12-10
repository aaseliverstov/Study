public class Cat extends Animal{
    String color;
    int weight;

    public Cat(String name, int age, String color, int weight) {
        super(name, age);
        this.color = color;
        this.weight = weight;
    }

    public void makeSound(){
        System.out.println("May");
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
