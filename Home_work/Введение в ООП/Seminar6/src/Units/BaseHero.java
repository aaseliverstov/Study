package Units;

import java.util.ArrayList;
import java.util.Arrays;


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
        this.health = maxHealth; //- new Random().nextInt(maxHealth);
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
//        return (int) health / maxHealth * 100;
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
}