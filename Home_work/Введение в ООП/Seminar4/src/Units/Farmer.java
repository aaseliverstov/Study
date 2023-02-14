package Units;

import java.util.ArrayList;

public class Farmer extends BaseSoldiers {
    int supply;

    public Farmer(String name, String role, int attack, int defence, int[] damage, int health, int speed, int x, int y, int supply) {
        super(name, role, attack, defence, damage, health, speed, x,y);
        this.supply = supply;
    }

    public Farmer(String name, String role, ArrayList<BaseHero> gang, int x, int y){
        super(name, role, 1, 1, new int[] {1, 1}, 1, 3 , x, y);
        this.supply = 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", \uD83D\uDED2 " + supply;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        if (supply == 0 ){
            supply += 1;
        }
    }
}
