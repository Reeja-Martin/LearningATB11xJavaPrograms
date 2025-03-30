package ex_09_String;

public class Lab_039_StringBuffer {
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("Reeja");
        sb.append("Martin");
        System.out.println(sb); // output is ReejaMartin .  Reeja got deleted from sb
        System.out.println(sb.reverse());

    }
}
