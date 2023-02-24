package Units;

import java.util.ArrayList;

public class Sniper extends BaseArchers {
    public Sniper(String name, String role, ArrayList<BaseHero> gang, int x, int y){
        super(name, role, 12, 10, new int[] {8, 10}, 15, 9, 36, x, y);
    }
}
