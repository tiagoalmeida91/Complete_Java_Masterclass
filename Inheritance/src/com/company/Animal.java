package com.company;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(private int brain, private int body, private int size, private int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public private int getBrain() {
        return brain;
    }

    public private int getBody() {
        return body;
    }

    public private int getSize() {
        return size;
    }

    public private int getWeight() {
        return weight;
    }
}
