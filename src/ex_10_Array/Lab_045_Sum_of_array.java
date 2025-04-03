package ex_10_Array;

import java.util.Scanner;

public class Lab_045_Sum_of_array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=scanner.nextInt();

        int[] input=new int[size];


        for(int i=0;i<input.length;i++) {
            System.out.println("enter inputs");
             input[i]=scanner.nextInt();
        }

        int sum=0;
        for(int i=input.length-1;i>=0;i--) {
            sum=sum+input[i];
             }
        System.out.println("Sum is: "+sum);
        scanner.close();

    }
 }
