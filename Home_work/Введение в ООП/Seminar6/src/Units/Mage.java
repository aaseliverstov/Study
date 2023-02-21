package Units;

import java.util.ArrayList;

public class Mage extends BaseWizards {
    public Mage(String name, String role, ArrayList<BaseHero> gang, int x, int y) {
        super(name, role, 17, 12, new int[] {-5, -5}, 30, 9, 1, x, y);
    }
}
