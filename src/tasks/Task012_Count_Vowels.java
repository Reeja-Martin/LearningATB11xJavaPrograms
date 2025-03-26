package tasks;

//Count vowels(a,e,i,o,u) and consonants in a String

import java.util.Scanner;

public class Task012_Count_Vowels {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String s=scanner.nextLine();

        int Vcount=0;int Ccount=0;
        s=s.toLowerCase();

    for(int i=0;i<s.length();i++) {
        char ch = s.charAt(i);
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                Vcount++;
            } else {
                Ccount++;
            }
        }
    }

        System.out.println("Vowels count : "+Vcount);
        System.out.println("Consonants count : "+Ccount);

        scanner.close();

    }
}
