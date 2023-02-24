package Units;

import java.util.ArrayList;

public class Crossbowman extends BaseArchers {
    public Crossbowman(String name, String role, ArrayList<BaseHero> gang, int x, int y) {
        super(name, role, 6, 3, new int[] {2,3}, 10, 4, 16, x, y);
    }
}
