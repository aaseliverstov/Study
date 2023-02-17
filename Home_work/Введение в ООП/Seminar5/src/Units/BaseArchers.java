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
        if (health == 0){
            return;
        }
        Vector2 target = getTarget(list);
        BaseHero targetY;
        float attackPower;
        float constMin = 12;
        float constMax = 4;

        if (target.x <= 4){
            attackPower = damage[1];
        } else if (target.x >= constMin) {
            attackPower = damage[0];
        }else{
            attackPower = damage[0] + ((target.x - constMax) / (constMin - constMax)) + (damage[1] - damage[0]);
        }
        targetY = list.get((int)target.y);

        if (shoots > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).role.equals("Farmer")) {
                    if (((Farmer) list.get(i)).supply > 0) {
                        if (targetY.health > 0) {
                            ((Farmer) list.get(i)).supply -= 1;
                            targetY.getDamage(attackPower);

                            System.out.print('\n');
                            System.out.print("Выстрел: " + role + "(" + name + ")" + " \uD83C\uDFF9 " + shoots + " -> " + "(" + attackPower + ") " + targetY.role + "(" + targetY.name + ")" + ", ♥️ " + (int) (targetY.health * 100 / targetY.maxHealth) + "%");
                        }
                        return;
                    } else {
                        continue;
                    }
                }
            }
            if (targetY.health > 0) {
                shoots -= 1;
                System.out.print('\n');
                System.out.print("Выстрел: " + role + " Name: " + name + " \uD83C\uDFF9 " + shoots + " -> " + "(-" + attackPower + ") " + targetY.role + "(" + targetY.name + ")" + ", ♥️ " + (int) (targetY.health * 100 / targetY.maxHealth) + "%");
            }
        }
    }

    private Vector2 getTarget(ArrayList<BaseHero> heroList){
        float minDistance = 100;
        int minIndex = 0;
        for (int i = 1; i < heroList.size(); i++) {
            float temp = getPosition().getDistance(heroList.get(0).getPosition().x, heroList.get(0).getPosition().y);
            if (temp < minDistance && heroList.get(i).health > 0){
                minDistance = temp;
                minIndex = i;
        }
//        for (BaseHero target:heroList){
//            System.out.println(getPosition().getDistance(target.getPosition().x, target.getPosition().y));
        }
        return new Vector2((int) minDistance, minIndex);
    }
}
