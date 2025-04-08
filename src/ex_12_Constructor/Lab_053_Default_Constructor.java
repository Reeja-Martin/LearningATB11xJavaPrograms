package ex_12_Constructor;

public class Lab_053_Default_Constructor {
    public static void main(String[] args) {

        Baby b1= new Baby(); // On creation of object it automatically call default constructor
        new Baby(); // default constructor gets called
        Baby b2; // no default constructor gets called
    }
}


class Baby{
    String name;

    void sleep(){
        System.out.println("Sleeping");

    }
    void eat(){
        System.out.println("Eating");
    }

    Baby()
    {
        System.out.println("I am default constructor");
    }


}