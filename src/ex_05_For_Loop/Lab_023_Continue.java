package ex_05_For_Loop;

public class Lab_023_Continue {

    public static void main(String[] args) {

        System.out.println("Example for Continue");
        for (int i =0; i<=10; i++)
        {
            if(i%2==0)
            {
                continue;   // It is used to come oput from loop
            }
            System.out.println("Odd: "+i);
        }
    }

    }

