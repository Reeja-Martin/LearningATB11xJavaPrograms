package ex_12_Constructor;

public class Lab_054_Default_constructor {
    public static void main(String[] args) {

        car c1=new car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("-------------------");
        c1.name="Pinto";

        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("-------------------");
        car c2=new car();

        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);


    }
}

class car{
    String name;
    String model;
    String year;

    car(){
        name ="Unknown";
        model="XXX";
        year ="19xx";
    }

}