package ex_08_Functions;

public class Lab_030_Functions {
    public static void main(String[] args) {

        f1();
        int result=f2();
        System.out.println(f2());
        float res=f3();
        System.out.println(f3());
        boolean ans=f4();
        System.out.println(f4());



    }

    static void f1(){
        System.out.println("Function 1");
    }

    static int f2(){
        return 10;
    }

    static float f3()
    {
        return 20;
    }

    static boolean f4()
    {
        return true;
    }
}
