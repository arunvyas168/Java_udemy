package com.company;

/**
 * Created by arun on 3/26/16.
 */
public class Cars extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Cars(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
