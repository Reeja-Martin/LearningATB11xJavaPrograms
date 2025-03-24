package tasks;

import java.util.Scanner;

public class Task010_Fibanocci {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int n=scanner.nextInt();

        int first=0,second=1;
        System.out.println("0");
        System.out.println("1");


        for (int i=2;i<=n;i++)
        {
            int next =first+second;
            System.out.println(next);
            first=second;
            second=next;

        }
    }


}
