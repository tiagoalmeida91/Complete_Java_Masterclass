package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bob=new Bank();//123,100,"bob","ada@gds.com",968969506);
        System.out.println(bob.getCustomerName());
        System.out.println(bob.getAccountNumber());


        bob.withdrawal(100.0);

        bob.deposit(50);
        bob.withdrawal(100.0);

        bob.deposit(51);
        bob.withdrawal(100.0);

    }
}
