package ex_05_For_Loop;

public class Lab_021_Find_Even_num {

    public static void main(String[] args) {

   // Find even numbers between 1 to 50

        for (int i =0; i<=50; i++)
        {
            if(i%2 ==0)
            {
                System.out.println("Even: "+i);
            }
            else{
                System.out.println("Odd: "+i);
            }
        }

    }
}
