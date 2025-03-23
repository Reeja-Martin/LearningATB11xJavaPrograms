package tasks;

    public class Task005_In_De_Operator {
        public static void main(String[] args) {
            int a = 20;
            System.out.println(--a + a++ + a--); // 19 + 19+20 =58
            System.out.println(a); //19
        }
    }

