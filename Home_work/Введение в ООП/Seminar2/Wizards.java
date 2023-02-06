import java.util.ArrayList;

public class Wizards extends BaseHero{
    int mana;
    public Wizards(String name, String role, int attack, int defence, int[] damage, int health, int speed, int mana) {
        super(name, role, attack, defence, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mana: " + mana;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        int minHealth = 100;
        int minIndex = 0;
        for (int i = 0; i < heroList.size(); i++) {
            String[] params = heroList.get(i).getInfo().split(" ");
            if (Integer.parseInt(params[1]) < 100){
                int temp = Integer.parseInt(params[1]);
                if (temp < minHealth) {
                    minHealth = temp;
                    minIndex = i;
                }
            }
        }
        heroList.get(minIndex).health -= damage[0];
        System.out.println();
        System.out.print("Лечение +" + -1 * damage[0] + "hp : " + heroList.get(minIndex));
    }

    @Override
    public String getInfo() {
        return role + " " + (health * 100 / maxHealth) + " " + "%";
    }
}
