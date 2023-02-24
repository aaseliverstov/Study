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
    public void step(ArrayList<BaseHero> heroList1, ArrayList<BaseHero> heroList2) {
        getExit(heroList1);
        if (health == 0){
            return;
        }
        int count_restore = 0;
        for (int g = 0; g < heroList1.size(); g++) {
            if (heroList1.get(g).health == 0) {
                ArrayList<BaseHero> list = new ArrayList<>();
                int mode = 2;

                if (heroList1.get(g).role == "Mage") {
                    mode = 1;
                }
                if (heroList1.get(g).role == "Rogue") {
                    mode = 1;
                }
                if (heroList1.get(g).role == "Sniper") {
                    mode = 1;
                }
                RestoreHeroes(list, mode);
                heroList1.set(g, list.get(0));
                System.out.print('\n');
                System.out.print("Призыв(воскрешение): " + role + "(" + name + ")" + " -> " + heroList1.get(g).role + "(" + heroList1.get(g).name + ")" + ", ♥️ " + (int) (heroList1.get(g).health * 100 / heroList1.get(g).maxHealth) + "%" + "(" + (int) heroList1.get(g).health + "/" + heroList1.get(g).maxHealth + ")");
                count_restore = 1;
            }
        }
            if (count_restore == 0) {
                int minHealth = 100;
                int minIndex = 0;
                for (int i = 0; i < heroList1.size(); i++) {
                    if (heroList1.get(i).health == 0) {
                        continue;
                    }
                    String[] params = heroList1.get(i).getInfo().split(" ");
                    if (Float.parseFloat(params[1]) < 100) {
                        float temp = Float.parseFloat(params[1]);
                        if (temp < minHealth) {
                            minHealth = (int) temp;
                            minIndex = i;
                        }
                    }
                }
                if (minHealth < 100) {
                    heroList1.get(minIndex).health -= damage[0];
                    if (heroList1.get(minIndex).health > heroList1.get(minIndex).maxHealth) {
                        heroList1.get(minIndex).health = heroList1.get(minIndex).maxHealth;
                    }
                    System.out.print('\n');
                    System.out.print("Лечение: " + role + "(" + name + ")" + " -> " + "(+" + -1 * damage[0] + "hp) " + heroList1.get(minIndex).role + "(" + heroList1.get(minIndex).name + ")" + ", ♥️ " + (int) (heroList1.get(minIndex).health * 100 / heroList1.get(minIndex).maxHealth) + "%" + "(" + (int) heroList1.get(minIndex).health + "/" + heroList1.get(minIndex).maxHealth + ")");
                }
            }
    }

    @Override
    public String getInfo() {
        return role + " " + (health * 100 / maxHealth) + " " + "%";
    }
}
