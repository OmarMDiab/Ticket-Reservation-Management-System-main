import java.util.Scanner;

public class Employee extends User{

    Employee(String username, String password) {
        super(username, password);
        job = "Employee";
    }

    Employee(){
    	System.out.println("Welcome Employee!");
        employeeSystemManager();
    }

    private void employeeSystemManager(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.Add a new client");
        System.out.println("2.Search client");
        System.out.println("3.Book event");
        System.out.println("4.Unbook event");
        System.out.println("5.Search event");
        int choice = input.nextInt();

        switch(choice){
            case 1:
            	
        }

    }
}
