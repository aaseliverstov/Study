package Units;

import java.util.ArrayList;

public class BaseArchers extends BaseHero{
    int shoots;
    public BaseArchers(String name, String role, int attack, int defence, int[] damage, int health, int speed, int shoots , int x, int y) {
        super(name, role, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
    }

    @Override
    public String toString() {
        return super.toString() + ", \uD83C\uDFF9 " + shoots;
    }

    @Override
    public void step(ArrayList<BaseHero> list) {
        if (shoots > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).role.equals("Farmer")) {
                    if (((Farmer) list.get(i)).supply > 0) {
                        ((Farmer) list.get(i)).supply -= 1;
                        System.out.print('\n');
                        System.out.print("Выстрел: " + role + " Name: " + name + " \uD83C\uDFF9 " + shoots);
                        return;
                    } else {
                        continue;
                    }
                }
            }
            shoots -= 1;
            System.out.print('\n');
            System.out.print("Выстрел: " + role + " Name: " + name + " \uD83C\uDFF9 " + shoots);
        }
    }
}
