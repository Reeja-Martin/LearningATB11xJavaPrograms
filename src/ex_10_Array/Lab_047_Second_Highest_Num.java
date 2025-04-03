package ex_10_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_047_Second_Highest_Num {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=scanner.nextInt();

        int[] input=new int[size];


        for(int i=0;i<input.length;i++) {
            System.out.println("enter inputs");
             input[i]=scanner.nextInt();
        }

        Arrays.sort(input);
        System.out.println(input[input.length-2]);

            scanner.close();

    }
 }
