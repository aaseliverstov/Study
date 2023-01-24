public class Archers extends BaseHero{
    int shoots;
    public Archers(String name, String role, int attack, int defence, int[] damage, int health, int speed, int shoots) {
        super(name, role, attack, defence, damage, health, speed);
        this.shoots = shoots;
}

    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }
}
