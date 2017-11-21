package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("Oeste");
        Wall wall2 = new Wall("Este");
        Wall wall3 = new Wall("Sul");
        Wall wall4 = new Wall("Norte");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed ("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom ("Tiago",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.getLamp().turnOn();
        bed.make();

    }
}
