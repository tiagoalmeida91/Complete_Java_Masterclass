package com.company;

public class VipPerson {

    public String name;
    public double credit;
    public String email;

    public VipPerson(){
        this("Default name",500000,"Default@default.com");
    }

    public VipPerson(String name, double credit) {
        this(name,credit,"default@default.com");
    }

    public VipPerson(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}
