package com.company;

/**
 * Created by mdrahaman on 7/11/17.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        }else{
            this.model = null;
        }
    }

    public String getModel(){
        return this.model;
    }

}
