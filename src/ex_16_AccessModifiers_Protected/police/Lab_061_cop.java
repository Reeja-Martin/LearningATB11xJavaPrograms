package ex_16_AccessModifiers_Protected.police;

// protected allows to access within same package and sub classes in differnt package
// default(No modifier) allows to access within same package and Not in sub classes of differnt package

public class Lab_061_cop {

    public int gun;
    String idcard;

  public Lab_061_cop(int gun){
       this.gun=gun;
       }

  protected void canIShoot(){
       System.out.println("Yes , you can shoot ");
   }
}
