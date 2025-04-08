package tasks;

import java.util.Scanner;

public class Task017_Pyramid_Pattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
        }


        for(int k=n;k<=n;k++)
        {
            for (int j=k+1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
