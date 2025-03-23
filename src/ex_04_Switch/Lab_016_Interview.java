package ex_04_Switch;

import java.util.Scanner;

public class Lab_016_Interview {
    public static void main(String[] args) {

    char ch= 'A';

        switch (ch){

            /*case 65:
                System.out.println("ASCII value"); //char is also an integer A = 65
                break;*/
            case 'A':
                System.out.println("Sunday");
                break;
            case 'B':
                System.out.println("Monday");
                break;


        }
        String browser ="Chrome";
        switch (browser)
        {
            case "chrome":
                System.out.println("Will not execute as it is case sensitive");
                break;
            case "Chrome":
                System.out.println("Chrome browser");
        }

        /*int num =10;
        switch (num)
        {
            case "chrome":
                System.out.println("Will not execute as it is case sensitive"); // DOESN'T EXECUTE AS System expects integer
                break;
            case "Chrome":
                System.out.println("Chrome browser");
        }*/

        /*boolean b =true;
        switch (b)
        {
            case b:
                System.out.println("Boolean not supported in switch"); //Boolean not supported in switch"
                break;


        }*/

        // jdk 13 and above  -> supported and break is not required
        int itemcode=001;
        switch (itemcode)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
        }

        //// jdk 13 and above  multiple case value is supported

        int item=001;
        switch (item)
        {
            case 001,002,003 :
                System.out.println("Multi value supported");
                break;
            case 004 :
                System.out.println("004");
                System.out.println("check");
        }

}
}