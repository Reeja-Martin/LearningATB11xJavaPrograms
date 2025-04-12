package tasks;

/*Create a Class with the Person - where we have DC, PC , two types.

        Fields. Instances - name, age, address, phone, isMale.

        Behaviour - eat, sleep, walk, doHome, printDetails()- print the details of the all the fields.*/

public class Task019_PC_DC_Constructor {
    public static void main(String[] args) {

        PersonNew p1=new PersonNew();
        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.age);
        System.out.println(p1.phnnum);
        System.out.println(p1.isMale);
        p1.eat();
        p1.doHome();
        p1.walk();

        System.out.println("============================");

        PersonNew p2=new PersonNew("Pinto",32,"canada",true,1234566766l);
        System.out.println(p2.name);
        System.out.println(p2.address);
        System.out.println(p2.age);
        System.out.println(p2.phnnum);
        System.out.println(p2.isMale);
        p2.eat();
        p2.doHome();
        p2.walk();


    }
}

 class PersonNew{

    String name;
    int age;
    String address;
    boolean isMale;
    long phnnum;

    void eat()
    {
        System.out.println(this.name+" can eat");
    }

     void walk()
     {
         System.out.println(this.name+" can walk");
     }
     void doHome()
     {
         System.out.println(this.name+" can do HomeWork");
     }

        PersonNew()
     {
         name="Reeja";
         age= 16;
         address="Kerala";
         isMale=false;
         phnnum=93456723345l;
     }

     PersonNew(String name,int age,String address,boolean isMale,long phnnum)
     {
         this.phnnum=phnnum;
         this.isMale=isMale;
         this.name=name;
         this.address=address;
         this.age=age;
     }
 }