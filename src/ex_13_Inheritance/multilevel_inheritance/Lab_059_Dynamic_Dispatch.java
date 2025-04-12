package ex_13_Inheritance.multilevel_inheritance;

public class Lab_059_Dynamic_Dispatch {
    public static void main(String[] args) {

        GrandFather g1=new GrandFather();

        GrandFather g2=new Father(); // Dynamic Dispatch - it can only call same name methods/variables
        g2.home(); // it will take home method defined in father class as object is of father class


        GrandFather g3=new Son(); // Dynamic Dispatch
        Father f2=new Son(); // Dynamic Dispatch
        g3.home();
        // suppose home is not present in son class then it takes from father. If father doesn't have home ,then it takes from Gf itself

        // WebDriver driver = new ChromeDriver();

    }
}
