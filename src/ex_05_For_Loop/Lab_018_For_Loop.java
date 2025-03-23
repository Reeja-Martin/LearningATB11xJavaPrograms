package ex_05_For_Loop;

public class Lab_018_For_Loop {

    public static void main(String[] args) {

        int i;
        for(i=0; i<10 ; i++)
        {
            System.out.println(i);
        }
        System.out.println("Value of i is "+i);

        //for loop without condition is possible.we have to manually stop it
        /*
        int j;
        for(j=0; ; ++j)
        {
            System.out.println(j);
        }*/
        // Process finished with exit code 130 - means manually stop

        int j=34;
        for(; j<40 ; j++)
        {
            System.out.println(j);
        }
        System.out.println("Value of j is "+j);
    }
}
