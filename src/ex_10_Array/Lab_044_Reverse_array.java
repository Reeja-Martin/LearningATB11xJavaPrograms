package ex_10_Array;

import java.util.Scanner;

public class Lab_044_Reverse_array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=scanner.nextInt();

        int[] input=new int[size];


        for(int i=0;i<input.length;i++) {
            System.out.println("enter inputs");
             input[i]=scanner.nextInt();
        }

        for(int i=input.length-1;i>=0;i--) {
            System.out.println(input[i]);
             }

        scanner.close();

    }
 }
