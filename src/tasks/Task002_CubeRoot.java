package tasks;

public class Task002_CubeRoot {
    public static void main(String[] args) {

        double x=10,y=10,z=10;

        double num =Math.pow(x,2)+Math.pow(y,2)-Math.abs(z);
        double result=Math.cbrt(num);
        System.out.println("The result of x^2 + y^2 - |z| is: " + num);
        System.out.println("The cuberoot is: " + result);



    }
}
