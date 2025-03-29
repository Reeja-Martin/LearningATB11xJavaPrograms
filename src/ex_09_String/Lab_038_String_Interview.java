package ex_09_String;

public class Lab_038_String_Interview {

    public static void main(String[] args) {

        String s1="Hello";
        String s2="Hello";

        // above are stored in string constant pool

        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");

        // above are stored in Object area


        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s3);
        System.out.println(s4==s5);
        System.out.println(s1==s5);

        System.out.println(s4.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s3.equalsIgnoreCase(s5));

    // == check for reference
    // equals check for contents
       
    }

}
