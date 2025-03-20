package ex_01_Java_Basic;

public class Lab010_TypeCasting {
    public static void main(String[] args) {

        //widening
        byte b = 10;
        float num = b; //implicit casting
        System.out.println(num);
        double a = (double) b; //Ecplicit casting
        System.out.println(a);

        //Narrowing
    int c=200;
     // byte d=c; implicit narrowing is not allowed
     byte d=(byte)c;//explicit narrowing. Data loss
        System.out.println(d); // 200 converted into binary number and will take 8 bits from it. Hence -56

    }

}
