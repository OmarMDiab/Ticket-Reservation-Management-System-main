import java.util.*;
import java.util.Scanner;

public class SystemManager {

    public ArrayList<User> system_users = new ArrayList<User>();

    Scanner input = new Scanner(System.in);
    SystemManager(){
        system_users.add(new Admin("amgad_12", "1234"));
        system_users.add(new Employee("ayman_12", "1234"));
        System.out.println("1.Create a new Employee Account");
        System.out.println("2.Login as Employee or Admin");
        ///////System.out.print("Choice: ");
        int choice = input.nextInt();
        if(choice == 1){
            createAccount();
            SystemManager systemManager = new SystemManager();
        }else if(choice == 2) {
            login();
            SystemManager systemManager = new SystemManager();
        }
    }

    private void createAccount(){
        System.out.print("Input a unique username: ");
        input.nextLine();
        String username = input.nextLine();
        for(User user: system_users){
            if(user.username.equals(username)){
                System.out.println("Username already taken");
                return;
            }
        }
        System.out.print("Input employee's password: ");
        String password = input.nextLine();
        system_users.add(new Employee(username, password));
    }

    private void login(){
        System.out.print("Input username: ");
        input.nextLine();
        String username = input.nextLine();
        System.out.print("Input password: ");
        String password = input.nextLine();
        for(User user: system_users){
            if(user.username.equals(username)){
                if(user.password.equals(password)){
                    if(user.job.equals("Admin")){
                        //Admin
                        Admin admin = new Admin();
                       //////// System.out.println("Admin");
                        return;
                    }else if(user.job.equals("Employee")) {
                        //Employee
                        Employee employee = new Employee();
                        /////System.out.println("Employee");
                        return;
                    }
                }else{
                    System.out.println("Wrong password");
                    return;
                }
            }
        }
        System.out.println("No username found");
    }

}
