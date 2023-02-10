package Units;

public class Rogue extends BaseSoldiers {
    public Rogue(String name, String role){
        super(name, role, 8, 3, new int[] {2, 4}, 10, 6);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
