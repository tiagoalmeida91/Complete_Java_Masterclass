package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] myInt = getInt(5);
        int []sorted = sortInt(myInt);
        printArray(sorted);

    }

    public static int [] getInt(int number){
        int[] array = new int[number];
        int pos=1;
        for (int i=0; i<array.length;i++){
            System.out.println("Enter number " + pos + ":" );
            pos+=1;
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int []array){
        for (int i=0; i<array.length;i++) {
            System.out.println("Element " + array[i]);
        }

    }

    public static int[] sortInt(int [] array){

        int [] sortedArray = new int [array.length];

        for (int i=0; i<array.length;i++){
            sortedArray[i]=array[i];
        }

        boolean flag =true;
        int temp;
        while (flag){
            flag=false;
            for(int i=0; i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

}
