package ex_08_Functions;

import java.util.Scanner;

public class Lab_035_Arithmatic_operations {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first num");
        int a=0;
        if(scanner.hasNextInt()) {
             a = scanner.nextInt();
        }
        else{
            System.out.println("Enter Integer Only");
            System.exit(0);
        }


        System.out.println("Enter second num");
        int b=0;
        if(scanner.hasNextInt()) {
            b=scanner.nextInt();
        }
        else{
            System.out.println("Enter Integer Only");
            System.exit(0);
        }


        int sum_res=sum(a,b);
        int sub_res=sub(a,b);
        int mult_res=mult(a,b);
        int div_res=div(a,b);
        int mod_res=mod(a,b);

        System.out.println("Sum = "+sum_res);
        System.out.println("Sub = "+sub_res);
        System.out.println("Mult = "+mult_res);
        System.out.println("Div = "+div_res);
        System.out.println("Mod = "+mod_res);

    scanner.close();



    }

     static int sum(int a,int b)
     {
         return a+b;
     }

    static int sub(int a,int b)
    {
        return a-b;
    }
    static int mult(int a,int b)
    {
        return a*b;
    }
    static int div(int a,int b)
    {
        if(b==0){

            System.out.println("Division by 0 is not allowed)");
            System.exit(0);
        }

            return a / b;

    }
    static int mod(int a,int b)
    {
        return a%b;
    }
}
