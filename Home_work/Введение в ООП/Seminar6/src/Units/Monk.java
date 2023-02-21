package Units;

import java.util.ArrayList;

public class Monk extends BaseWizards {
    public Monk(String name, String role, ArrayList<BaseHero> gang, int x, int y){
        super(name, role,12, 7, new int[] {-4, -4}, 30, 5, 1,x,y);
    }
}
