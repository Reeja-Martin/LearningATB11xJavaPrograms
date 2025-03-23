package ex_06_While;

import java.util.Scanner;

public class Lab_026_Factorial {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        int fact=1;
        if(num<1)
        {
            System.out.println(fact);
        }
        else
        {
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.print("Factorail of Number "+num+" is "+fact);
        }


    }

}
