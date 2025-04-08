package ex_11_OOPs;

public class Lab_052_Class_Object {
    public static void main(String[] args) {

    Person reeja;  // allocated in null area
        // reeja is Object Reference

    Person prince =new Person(); // memory allocated in heap area
        // new Person is Object

        prince.name="Reeja";
        System.out.println(prince.name);

    }
}

 class Person{

    String name;
    byte age;
    double salary;

    void sleep()
    {
        System.out.println("I am sleeping");
    }
 }