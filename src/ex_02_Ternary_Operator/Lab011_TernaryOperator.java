package ex_02_Ternary_Operator;

public class Lab011_TernaryOperator {
    public static void main(String[] args) {

        int age=20;
        String Can_I_Vote=age>=18?"Yes,You can vote":"No,You can't";
        System.out.println(Can_I_Vote);


        int num=12;
        String result=num>0 ? "Positive Number":"Negative Number";
        System.out.println(result);

   //Nested Ternery
        int mark=3;
        String grade= (mark>10? (mark>20 ? (mark>30 ? "A":"B"):"C"):"Fail");
        System.out.println(grade);

    //Max of 3 num

        int x=13,y=24,z=10;
        int max= (x>y) ? ((x >z)? x : z): ((y>z) ? y :z);
        System.out.println(max);

    }

}
