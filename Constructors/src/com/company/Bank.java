package com.company;

public class Bank {

    private int accountNumber;
    private float balence=0;
    private String customerName;
    private String email;
    private int phonenumber;


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

        if (balence>this.balence){
            System.out.println("invalid operaction");
        }
        else{
            this.balence = balence;
        };
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
