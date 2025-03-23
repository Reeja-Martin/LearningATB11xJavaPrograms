package tasks;

public class Task006_CLI_input {

    // Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {


        String name =args[0];
        String age_string =args[1];
        String salary_string =args[2];

        int age= Integer.parseInt(age_string);
        long salary =Long.parseLong(salary_string);

        System.out.println(name + " of age "+ age + " has salary "+salary);

    }
}
