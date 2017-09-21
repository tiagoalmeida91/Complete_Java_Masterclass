package com.company;

public class Bank {

    private int accountNumber;
    private float balence = 0;
    private String customerName;
    private String email;
    private int phonenumber;

    public Bank() {
        this(123,100,"default","ada@gds.com",968969506);
    }

    public Bank(int accountNumber, float balence, String customerName,
                String email, int phonenumber) {

        this.accountNumber = accountNumber;
        this.balence = balence;
        this.customerName = customerName;
        this.email = email;
        this.phonenumber = phonenumber;
        System.out.println("constructor call");
    }

    public void deposit(float ammount) {
        this.balence += ammount;
        System.out.println("deposit: " + ammount + " Balance: " + this.balence);
    }

    public void withdrawal(double withdrawalammount) {
        if (this.balence - withdrawalammount <= 0) {
            System.out.println("NO MONEY");
        } else {
            this.balence -= withdrawalammount;
            System.out.println("withdrawal of: " + withdrawalammount + " remaing balance: " + this.balence);
        }
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalence() {
        return this.balence;
    }

    public void setBalence(float balence) {
        this.balence = balence;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
