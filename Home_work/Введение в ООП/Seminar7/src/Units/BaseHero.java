package Units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public abstract class BaseHero implements BaseInterface{
    String name, role;
    Integer attack, defence, maxHealth, speed;
    protected float health;
    int[] damage;
    protected Vector2 position;

    public BaseHero(String name, String role, int attack, int defence, int[] damage, int health, int speed, int x, int y){
        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth;
        this.speed = speed;
        this.position = new Vector2(x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList1, ArrayList<BaseHero> heroList2) {

    }

    @Override
    public String getInfo() {
        return role + " " + (health * 100 / maxHealth) + " ";
    }

    @Override
    public String toString() {
        return  role + "(" + name + ")" + ", ⚔️ " + attack + ", ⛨: " + defence + ", ☠️ " + Arrays.toString(damage) + ", ♥️ " + (int)(health * 100 / maxHealth) + "%" + "(" + (int)health + "/" + maxHealth + ")"+ ", \uD83D\uDCA8 " + speed;
    }

    public String getRole(){
        return role;
    }

    public Vector2 getPosition() {
        return position;
    }

    public String getName(){
        return role;
    }

    protected void getDamage(float attackPower){
        this.health -= attackPower;
        if (this.health < 0){
            this.health = 0;
        } else if (this.health > maxHealth){
            this.health = maxHealth;
        }
    }
    public float getHealth(){
        return (int) health;
    }

    public void getExit(ArrayList <BaseHero> heroList){
        int count = 0;
        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).health == 0){
                count ++;
            }
        }
        if (count == 10){
            System.out.println("");
            System.out.println("☠" + " The End " + "☠");
            System.exit(count);
        }
    }

    public boolean getFreeCell(ArrayList<BaseHero> heroList, int x, int y){
        boolean free = false;
        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).position.x == x){
                free = true;
            } else {
                free = false;
            }
        }
        return free;
    }

    public static void RestoreHeroes(ArrayList<BaseHero> heroes, int mode){
        int x = 1;
        int y = 1;
        if (mode == 1){
            for (int k = 0; k < 1; k++) {
                int number = randomInt(4);
                if (number == 0) {
                    heroes.add(new Farmer("restore_npc", "Farmer", heroes, x, y++));
                }
                else if (number == 1) {
                    heroes.add(new Rogue("restore_npc", "Rogue", heroes, x, y++));
                }
                else if (number == 2) {
                    heroes.add(new Sniper("restore_npc", "Sniper", heroes, x, y++));
                }
                else if (number == 3) {
                    heroes.add(new Mage("restore_npc", "Mage", heroes, x, y++));
                }
            }
        } else if (mode == 2) {
            x = 10;
            y = 1;
            for (int k = 1; k <2; k++) {
                int number = randomInt(4);
                if (number == 0) {
                    heroes.add(new Crossbowman("restore_npc", "Crossbowman", heroes, x, y++));
                }
                else if (number == 1) {
                    heroes.add(new Monk("restore_npc", "Monk", heroes, x, y++));
                }
                else if (number == 2) {
                    heroes.add(new Spearman("restore_npc", "Spearman", heroes, x, y++));
                }
                else if (number == 3) {
                    heroes.add(new Farmer("restore_npc", "Farmer", heroes, x, y++));
                }
            }
        }
    }
    public static int randomInt(int num){
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        int temp = randomNum.nextInt(num);
        return temp;
    }

    public int getSpeed(){
        return speed;
    }
}