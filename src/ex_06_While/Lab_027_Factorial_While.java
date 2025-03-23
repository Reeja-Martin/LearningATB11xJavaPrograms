package ex_06_While;

import java.util.Scanner;

public class Lab_027_Factorial_While {
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
        {   int i=1;
            while(i<=num)

            {
                fact=fact*i;
                i++;
            }
            System.out.print("Factorail of Number "+num+" is "+fact);
        }


    }

}
