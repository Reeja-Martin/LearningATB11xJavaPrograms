package ex_03_If_condition;

import java.util.Scanner;

public class Lab_014_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age!");
        int age= scanner.nextInt();

        if(age>18){
            System.out.println("You can Vote");
        }
        else{
            System.out.println("You can't vote");
        }
    }
}
