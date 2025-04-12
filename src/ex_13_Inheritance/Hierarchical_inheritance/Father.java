package ex_13_Inheritance.Hierarchical_inheritance;

// father and 2 sons

public class Father {
    public static void main(String[] args) {

        Father f1=new Father();
        Son s1=new Son();
        s1.father();

        Son2 s2=new Son2();
        s2.father();

    }
    void father(){
        System.out.println("father");
    }

    void home()
    {
        System.out.println("Father HOme");
    }
}
