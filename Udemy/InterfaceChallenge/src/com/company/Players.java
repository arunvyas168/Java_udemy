package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by arun on 4/10/16.
 */
public class Players implements ISaveable {

    private String name;
    private int hitPoints;
    private int health;
    private String weapons;

    public Players(String name, int hitPoints, int health) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.health = health;
        this.weapons = "Gun";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", health=" + health +
                ", weapons='" + weapons + '\'' +
                '}';
    }

    @Override
    public List<String> write() {

        System.out.println("Inside Player::write() Creating new list from this. ");
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.health);
        values.add(3,this.weapons);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        System.out.println("Inside Player::read() Saving info to this. from List");
        if((savedValues!=null)&&(savedValues.size()==4)){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.health = Integer.parseInt(savedValues.get(2));
            this.weapons = savedValues.get(3);
        }
    }
}
