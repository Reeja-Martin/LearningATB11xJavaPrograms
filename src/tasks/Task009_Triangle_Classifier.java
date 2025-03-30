package tasks;

import java.util.Scanner;

public class Task009_Triangle_Classifier {

    //Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides, determine
    // if the triangle is equilateral (all sides are equal),
    // isosceles (exactly two sides are equal), or
    // scalene (no sides are equal).
    // Use an if-else statement to classify the triangle.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first side of trianle");
        int a=scanner.nextInt();
        System.out.println("Enter second side of trianle");
        int b=scanner.nextInt();
        System.out.println("Enter third side of trianle");
        int c=scanner.nextInt();

        if(a<=0||b<=0||c<=0)
        {
            System.out.println("This is not a triangle");
            System.exit(0);
        }
        else if (a+b<=c||a+c<=b||b+c<=a)
        {
            System.out.println("This is not a triangle");
            System.exit(0);
         }
        else if(a==b && b==c)
        {
            System.out.println("It is an Equilateral Triangle");
        }
        else if(a==b||b==c||a==c)
            {
                System.out.println("It is an Isoscelus triangle");
            }
            else
            {
                System.out.println("It is an Scalene triangle");
            }


    scanner.close();
    }
}
