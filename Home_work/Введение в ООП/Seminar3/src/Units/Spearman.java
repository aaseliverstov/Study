package Units;

public class Spearman extends BaseSoldiers {
    public Spearman(String name, String role){
        super(name, role, 4, 5, new int[] {1, 3}, 10, 4);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}