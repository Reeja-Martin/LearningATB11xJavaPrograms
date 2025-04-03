package tasks;

import java.util.Scanner;

public class Task016_Odd_Even_num_Array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of array elements");
        int size=sc.nextInt();

        int[] input=new int[size];

        System.out.println("Enter array elements");
        for(int i=0;i< input.length;i++)
        {
            input[i]=sc.nextInt();

        }

        System.out.println("Even numbers are");

        for(int i=0;i< input.length;i++) {
            if (input[i] % 2 == 0) {
                System.out.print(input[i] + " ");
            }
        }

        System.out.println(" ");
        System.out.println("Odd numbers are");

        for(int i=0;i< input.length;i++) {
            if (input[i] % 2 != 0) {
                System.out.print(input[i] + " ");
            }
        }
        sc.close();
    }

}
