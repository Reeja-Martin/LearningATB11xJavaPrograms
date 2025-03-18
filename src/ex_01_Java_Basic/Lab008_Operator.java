package ex_01_Java_Basic;

public class Lab008_Operator {
    public static void main(String[] args) {

       int a=20;
       int b=6;
       float c=3f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a/c);//answer will be in highest data type
        System.out.println(c/a);

        //Relational operator

        int age_reeja = 16;
        int age_pinto =25;
        boolean result=age_reeja >=age_pinto;
        System.out.println(result);

        System.out.println(" ");
        boolean a1=true;
        System.out.println(!a1);
        System.out.println(!!a1);
        boolean b1=false;
        boolean c1= true||false;
        System.out.println(c1);

        System.out.println(10==10);
        System.out.println(10>10);
        System.out.println(!(10>10));







    }

}
