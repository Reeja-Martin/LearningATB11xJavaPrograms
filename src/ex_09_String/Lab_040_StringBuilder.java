package ex_09_String;

public class Lab_040_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Reeja");
        sb.append("Martin");
        System.out.println(sb); // output is ReejaMartin .  Reeja got deleted from sb
        System.out.println(sb.reverse());
        System.out.println(sb);
        System.out.println(sb.delete(5,7));
        System.out.println(sb.replace(5,7,"Good"));
        
    }
}
