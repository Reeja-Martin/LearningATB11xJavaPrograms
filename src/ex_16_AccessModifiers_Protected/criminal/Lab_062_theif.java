package ex_16_AccessModifiers_Protected.criminal;

import ex_16_AccessModifiers_Protected.police.Lab_061_cop;

public class Lab_062_theif {
    public static void main(String[] args) {

        Lab_061_cop theif=new Lab_061_cop(100);
     // c1.canIShoot();
        System.out.println(theif.gun);

    }
}
