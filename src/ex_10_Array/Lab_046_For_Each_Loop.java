package ex_10_Array;

import java.util.Scanner;

public class Lab_046_For_Each_Loop {
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
        for(int n:input)
        {
            sum=sum+n;

        }
        System.out.println("Sum is "+sum);
        System.out.println("Array is : ");

        for(int n:input) {           // For Each loop or Enhanced loop
            System.out.println(n);

        }
            scanner.close();

    }
 }
