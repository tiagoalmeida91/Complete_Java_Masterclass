package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(){
        super("Deluxe","Sausage & Bacon",14.54,"White");
        super.addHamburger1("Chips", 2.75);
        super.addHamburger2("Drink", 1.81);
    }
    @Override
    public void addHamburger1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburger2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburger3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburger4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

}
