package ex_01_Java_Basic;

public class Lab013_Increement_decreement {
    public static void main(String[] args) {

        //pre-increement

        int a=0;
        int b=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a);

        //post increement

        System.out.println(a++); //print first then increese value
        System.out.println(a);

    int a1=10;
    int result=a1++;
        System.out.println(a1);
        System.out.println(result);

    int x= 20;
        System.out.println(x++ + x);

        int y= 15;
        System.out.println(y++ + ++y);
        System.out.println(y);

        int z= 15;
        System.out.println(++z + ++z);
        System.out.println(z);

        // decreement

        int q= 15;
        int res=q--;
        System.out.println(res);
        System.out.println(q);

        int j= 15;
        int res1=--j;
        System.out.println(res1);
        System.out.println(j);
    }
}
