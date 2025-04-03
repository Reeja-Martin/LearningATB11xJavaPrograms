package tasks;

import java.util.Scanner;

public class Task015_Second_Largest_Number {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length of array");
        int size= scanner.nextInt();

        if(size<3){

            System.out.println("Array must have at least 2 elements to find the second largest number");
            return;
        }

        int[] input=new int[size];
        System.out.println("enter numbers");

        for(int i=0;i< input.length;i++)
        {
            input[i]=scanner.nextInt();

        }



        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        for(int i=0;i< input.length;i++)
        {
            if(input[i] > largest)
            {
                second_largest=largest;
                largest=input[i];
            }
            else if(input[i]> second_largest && input[i]!= largest)
            {
            second_largest=input[i];

            }

        }

        System.out.println("Second largest num is "+second_largest);

        scanner.close();
    }
}
