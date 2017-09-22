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


        Bank ta=new Bank("tim","tim@sdgfd.com",12345);
        System.out.println(ta.getCustomerName());

        VipPerson vip1 =new VipPerson();
        System.out.println(vip1.getName());

        VipPerson vip2 =new VipPerson("bob",25000);
        System.out.println(vip2.getName());

        VipPerson vip3 = new VipPerson("tim",100,"tim@tim.com");
        System.out.println(vip3.getName());
    }
}
