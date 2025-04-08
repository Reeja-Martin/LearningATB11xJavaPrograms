package ex_12_Constructor;

public class Lab_055_Parameterised_constructor {
    public static void main(String[] args) {


        System.out.println("-------------------");
        car2 c1=new car2("tesla","Model 3",2015);
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("-------------------");

        car2 c2=new car2("BMW","Model 5",2010);
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);

        System.out.println("-------------------");

        car2 c3=new car2();
        System.out.println(c3.name);  // it will give null as output as we haven't set values on default constructor

    }
}

class car2{
    String name;
    String model;
    int year;

    // parameterised constructor

    car2(String name,String model,int year){

        this.name =name;
        this.model=model;
        this.year =year;
    }

    car2()
    {

    }

}