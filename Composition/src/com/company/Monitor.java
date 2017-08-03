package com.company;

/**
 * Created by mdrahaman on 7/21/17.
 */
public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resulation nativeResulation;


    public Monitor(String model, String manufacture, int size, Resulation nativeResulation) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResulation = nativeResulation;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + "in color" + color);
    }
}
