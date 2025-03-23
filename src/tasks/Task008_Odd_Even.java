package tasks;

public class Task008_Odd_Even {

    // Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {

    String n1=args[0];
    String n2=args[1];
    int num1=Integer.parseInt(n1) ;
    int num2=Integer.parseInt(n2) ;

    String result = num1%2 == 0 ? "Even" : "odd";
        System.out.printf("Number %d is %s \n",num1,result);

    String result2 = num2%2 == 0 ? "Even" : "odd";
        System.out.printf("Number %d is %s ",num2,result2);

    }
}
