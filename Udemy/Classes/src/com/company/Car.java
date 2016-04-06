package com.company;

/**
 * Created by arun on 2/28/16.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("shelby")){
            this.model = model;
        }else {
            this.model = "unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
