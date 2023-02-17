package Units;

import java.util.ArrayList;

public class BaseWizards extends BaseHero{
    int mana;
    public BaseWizards(String name, String role, int attack, int defence, int[] damage, int health, int speed, int mana, int x, int y) {
        super(name, role, attack, defence, damage, health, speed, x, y);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", \uD83E\uDE84 " + mana;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        if (health == 0){
            return;
        }
        int minHealth = 100;
        int minIndex = 0;
        for (int i = 0; i < heroList.size(); i++) { //teamList
            if (heroList.get(i).health == 0){
                continue;
            }
            String[] params = heroList.get(i).getInfo().split(" ");
            if (Float.parseFloat(params[1]) < 100){
                float temp = Float.parseFloat(params[1]);
                if (temp < minHealth) {
                    minHealth = (int)temp;
                    minIndex = i;
                }
            }
        }
        if (minHealth < 100) {
            heroList.get(minIndex).health -= damage[0];
            System.out.println();
            System.out.print("Лечение +" + -1 * damage[0] + "hp : " + heroList.get(minIndex));
        }
    }

    @Override
    public String getInfo() {
        return role + " " + (health * 100 / maxHealth) + " " + "%";
    }
}
