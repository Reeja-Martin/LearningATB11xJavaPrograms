package tasks;

public class Task018_Class_diff_Params {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.name="reeja";
        p1.age=28;
        p1.weight=60;
        p1.height=165.4f;
        //p1.is_married=true;

        p1.talk();
        p1.married();
        p1.input_age(p1.name, p1.age);
        p1.bmi(p1.weight, p1.height);
    }
}

class Person{

    String name;
    String gender;
    byte age;
    double salary;
    double phn;
    String address;
    String email;
    boolean is_married;
    float weight;
    float height;


    void talk()
    {
        System.out.println("I can talk");
    }

    boolean married()
    {
        System.out.println("Are you married" + (is_married? " yes" : " No"));
        return is_married;
    }
    void input_age(String name, int age){


         System.out.println("name is "+name+" and age is "+age);

    }

    double bmi(float weight,float height)
    {
        height=height/100;
        double bmi= weight/(Math.pow(height,2));
        System.out.println("Your bmi is " +bmi);
        return bmi;
    }



}