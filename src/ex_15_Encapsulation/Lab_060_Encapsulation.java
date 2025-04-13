package ex_15_Encapsulation;

public class Lab_060_Encapsulation {
    public static void main(String[] args) {

        Login l1=new Login("Reeja","pass123");
        System.out.println(l1.getUsername());
        l1.setUsername("reeja123");
        System.out.println(l1.getUsername());
        System.out.println(l1.getPassword());
        l1.setPassword("Password@123",true);
        System.out.println(l1.getPassword());

    }

}
class Login{

    private String username;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {

        if(isAdmin){
            this.password = password;
        }
        else{
            System.out.println("You don't have admin access");
        }

    }

     Login(String username,String password){
        this.username=username;
        this.password=password;
    }


}
