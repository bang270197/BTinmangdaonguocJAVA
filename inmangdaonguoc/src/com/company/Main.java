package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int size;
     int[] array ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while ( size >20);
        array =new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element" + (i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Element in array : ", "");
        for (int j=0 ;j<array.length;j++){
            System.out.printf(array[j]+"\t");
        }
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
