package tasks;

import java.util.Scanner;

public class Task014_Palindrome_UsingFunction {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String s=scanner.nextLine();

        String newString=reverseString(s);
        if(s.equalsIgnoreCase(newString))
        {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


        scanner.close();

        }

    private static String reverseString(String s) {

        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
        return reverse;

    }


}
