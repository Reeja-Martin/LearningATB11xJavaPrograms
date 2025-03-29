package ex_09_String;

import java.util.Locale;

public class Lab_036_String_Immutable {

    public static void main(String[] args) {

        String name="reeja";
        name.toUpperCase(); //REEJA
        System.out.println(name);  //reeja   immutable nature.

        name=name.toUpperCase();
        System.out.println(name); //Reeja
    }
}
