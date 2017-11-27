package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myInt=getInt(5);

        for (int i=0; i<myInt.length;i++){
            System.out.printf("Element " + i + ", typing value was " + myInt[i] + "\n");
        }

        System.out.println("The average is  " +getAvarage(myInt));

    }

    public static int[] getInt(int number){
        System.out.printf("Enter " + number +" integer values. \r");
        int[]values=new int[number];
        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static double getAvarage(int[]array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum +=array[i];
        }

        return (double)sum/(double)array.length;
    }
}
