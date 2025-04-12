package ex_14_Polymorphism.method_overriding;

//same method name in subclass

class Animal
{

    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{

   @Override
   void sound(){
        System.out.println("Dog Barks");
    }
}

class Main{

public static void main(String[] args) {

    Dog d1 = new Dog();
    d1.sound();
}
}
