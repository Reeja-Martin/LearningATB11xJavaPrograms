package ex_08_Functions;

public class Lab_034_w_param_w_returntype {
    public static void main(String[] args) {

        //without parameter with returntype

        long mult1= calc(10,120,56);
        long mult2=calc(0,20898,133);

        System.out.println(mult1);
        System.out.println(mult2);

    }

    static long calc(int a,int b,int c){

        return (a*b*c);


    }


}
