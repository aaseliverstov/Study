package Units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements BaseInterface{
    String name, role;
    Integer attack, defence, health, maxHealth, speed;
    int[] damage;

    public BaseHero(String name, String role, int attack, int defence, int[] damage, int health, int speed){
        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth - new Random().nextInt(maxHealth);
        this.speed = speed;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {

    }

    @Override
    public String getInfo() {
        return role + " " + (health * 100 / maxHealth) + " " + "%";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Role: " + role + ", Attack: " + attack + ", Defence: " + defence + ", Damage: " + Arrays.toString(damage) + ", Health: " + (health * 100 / maxHealth) + "%" + ", Speed: " + speed;
    }

    public String getRole(){
        return role;
    }
}