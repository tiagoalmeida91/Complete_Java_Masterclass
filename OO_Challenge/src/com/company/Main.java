package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "sausage",3.56,"white");
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburger1("Tomato",0.27);
	hamburger.addHamburger2("Lettuce",0.75);
    hamburger.addHamburger3("Cheese",1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyaddition1("Egg", 5.43);
        healthyBurger.addHealthyaddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburger3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}
