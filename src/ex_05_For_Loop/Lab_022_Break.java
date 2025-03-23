package ex_05_For_Loop;

public class Lab_022_Break {

    public static void main(String[] args) {

        System.out.println("Example for break");
        for (int i =0; i<=10; i++)
        {
            if(i==5)
            {
              break;   // It is used to come oput from loop
            }
            System.out.println(i);
        }

        System.out.println("Example for continue");

        for (int i =0; i<=10; i++)
        {
            if(i==5)
            {
                continue;   // skip below code and move to top
            }
            System.out.println(i);
        }

        }

    }

