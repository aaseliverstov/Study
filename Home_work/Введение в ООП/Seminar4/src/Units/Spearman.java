package Units;

import java.util.ArrayList;

public class Spearman extends BaseSoldiers {
    public Spearman(String name, String role, ArrayList<BaseHero> gang, int x, int y){
        super(name, role, 4, 5, new int[] {1, 3}, 10, 4, x, y);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}