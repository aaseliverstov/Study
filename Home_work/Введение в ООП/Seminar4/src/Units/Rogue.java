package Units;

import java.util.ArrayList;

public class Rogue extends BaseSoldiers {
    public Rogue(String name, String role, ArrayList<BaseHero> gang, int x, int y){
        super(name, role, 8, 3, new int[] {2, 4}, 10, 6, x, y);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
