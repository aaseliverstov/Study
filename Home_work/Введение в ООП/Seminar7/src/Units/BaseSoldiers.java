package Units;

import java.util.ArrayList;

public class BaseSoldiers extends BaseHero{
    public BaseSoldiers(String name, String role, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(name, role, attack, defence, damage, health, speed, x, y);
    }


    @Override
    public void step(ArrayList<BaseHero> heroList1, ArrayList<BaseHero> heroList2) {
        int index = 0;
        if (this.health == 0) {
//            System.out.println(this.name + "" + this.role + " is dead");
        } else {
            float min = Float.MAX_VALUE;
            for (int i = 0; i < heroList2.size(); i++) {
                if (heroList2.get(i).health != 0){
                    if (min > getPosition().getDistance(heroList2.get(i).position.x, heroList2.get(i).position.y)){
                        min = getPosition().getDistance(heroList2.get(i).position.x, heroList2.get(i).position.y);
                        index = i;
                    }
                }
            }
            float posX;
            float posY;
            posX = this.position.x - heroList2.get(index).position.x;
            posY = this.position.y - heroList2.get(index).position.y;

            if (posY == 0) {
                if (posX < 0) {
                    this.position.x += 1;
                } else {
                    this.position.x -= 1;
                }
            }
            if (posY < 0) {
                this.position.y += 1;
            }

            if (posY > 0) {
                this.position.y -= 1;
            }
        }
    }
}

