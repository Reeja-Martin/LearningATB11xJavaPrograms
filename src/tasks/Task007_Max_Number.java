package tasks;

public class Task007_Max_Number {

    // Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {

    String n1=args[0];
    String n2=args[1];
    int num1=Integer.parseInt(n1) ;
    int num2=Integer.parseInt(n2) ;

    int result = num1 > num2 ? num1 : num2 ;
        System.out.println("Largest number is "+result);


    }
}
