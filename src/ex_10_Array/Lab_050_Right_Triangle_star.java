package ex_10_Array;

import java.util.Scanner;

public class Lab_050_Right_Triangle_star {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            scanner.close();
        }
    }

}
