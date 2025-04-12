package ex_13_Inheritance.multilevel_inheritance;

// GF --> father --> Son

public class Lab_058_MultiLevel_inheritance {
    public static void main(String[] args) {

        GrandFather g1= new GrandFather();
        g1.gf();
        // g1.son();
        //g1.father();

        System.out.println("-------------------");

        Father f1 =new Father();
        f1.father();
        f1.gf();
        //f1.son();

        System.out.println("------------------");

        Son s1=new Son();
        s1.son();
        s1.father();
        s1.gf();
    }
}
