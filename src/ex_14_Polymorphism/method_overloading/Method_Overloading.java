package ex_14_Polymorphism.method_overloading;

//within the class , Same method name with different arguments

public class Method_Overloading {
    public static void main(String[] args) {

        Method_Overloading m1=new Method_Overloading();
        m1.add(3,5);
        m1.add(3.45,2.002);
        m1.add();


    }
        int add(int a,int b)
        {
            int sum=a+b;
            System.out.println(sum);
            return(sum);
        }

        double add(double a, double b){
            double sum=a+b;
            System.out.println(sum);
            return sum;
        }

        void add(){
            int a=5,b=6;
            System.out.println(a+b);
        }

}
