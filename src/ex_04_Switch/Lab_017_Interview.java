package ex_04_Switch;

public class Lab_017_Interview {
    public static void main(String[] args) {

   int a=-1;
   switch(a)

   {
       default :
           System.out.println("Not Valid");
           break;
       case -1:
           System.out.println("Matching value");
       break;
       case 2:
           System.out.println("Check value");
   }

}
}