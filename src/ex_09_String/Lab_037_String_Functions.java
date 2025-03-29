package ex_09_String;

public class Lab_037_String_Functions {

    public static void main(String[] args) {

        String name = "reeja";
        System.out.println(name.toUpperCase());
        ;
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.equals("hello"));
        System.out.println(name.contains("aas"));
        System.out.println(name.concat(" World"));
        System.out.println(name.indexOf("j"));
        System.out.println(name.replace("e","E"));

        String[] split= name.split("e");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println(name.substring(1,4));
        System.out.println(name.startsWith("e"));
        System.out.println(name.endsWith("a"));

        String s= "reeja martin  ";
        System.out.println(s.trim());
        System.out.println(s);
        System.out.println(s.compareTo("zes ad"));



    }

}
