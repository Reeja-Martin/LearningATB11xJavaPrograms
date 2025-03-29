package tasks;

import java.util.Scanner;

public class Task013_Palindrome {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String s=scanner.nextLine();

        s=s.toLowerCase();
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
           if(s.charAt(i)==s.charAt(n-1))
           {
               n--;
           }
           else{
               System.out.println("Not Palindrom");
               System.exit(0);
           }
        }
        System.out.println("Palindrome");
        scanner.close();

    }


}
