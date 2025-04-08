package ex_12_Constructor;

public class Lab_056_Constructor_Overloading {
    public static void main(String[] args) {

        NewBaby b1=new NewBaby("vava","male");
        NewBaby b2=new NewBaby("Female");

        System.out.println(b1.name);
        System.out.println(b1.gender);
        b1.eat();

        System.out.println("=========");
        System.out.println(b2.name);
        System.out.println(b2.gender);



    }
}

 class NewBaby{

    String name;
    String gender;

    void eat(){

        System.out.println(this.name +" is eating");
    }

    NewBaby(String name,String gender)
    {
        this.name=name;
        this.gender=gender;
    }

    NewBaby(String gender)         //constructor overloading. constructor with different parameter
    {
        this.gender=gender;
    }
 }