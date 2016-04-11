package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by arun on 4/11/16.
 */
public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int health;

    public Monster(String name, int hitPoints, int health) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.health = health;
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

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", health=" + health +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(""+this.getHitPoints());
        values.add(""+this.getHealth());
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if ((savedValues!=null)&&(savedValues.size() == 3)){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.health = Integer.parseInt(savedValues.get(2));
        }

    }





}
