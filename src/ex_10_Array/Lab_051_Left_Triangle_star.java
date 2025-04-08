package ex_10_Array;

import java.util.Scanner;

public class Lab_051_Left_Triangle_star {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n = scanner.nextInt();

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            scanner.close();
        }
    }

}
