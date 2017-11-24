package com.company;

public class Hamburger {

    private String name;
    private String meat;
    private Double price;
    private String BreadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        BreadRollType = breadRollType;
    }

    public void addHamburger1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburger2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburger3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburger4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hambergerPrice = this.price;
        System.out.println(this.name + "hambunger " + "on a " + this.BreadRollType + "roll" +
                this.meat + ", price is " + this.price);

        if (this.addition1Name != null) {
            hambergerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra of " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hambergerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra of " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hambergerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra of " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hambergerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra of " + this.addition4Price);
        }
        return hambergerPrice;
    }
}
