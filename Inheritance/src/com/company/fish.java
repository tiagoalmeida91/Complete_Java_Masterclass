package com.company;

public class fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackfin(){

    }

    private void swin(int speed){
    moveMuscles();
    moveBackfin();
    super.move(speed);
    }

}
