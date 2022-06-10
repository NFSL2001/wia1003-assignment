package ExtraFeatures;

import java.util.Scanner;

public class LoginPage {
    /*
     * OUTPUT: return true if admin, false if user
     */
    public boolean login() { 
        int attemptCount = 3;
        Scanner loginsc = new Scanner(System.in);

        while (attemptCount > -1) {
            System.out.println();
            System.out.println();
            System.out.println("======== Welcome to Confession Time ========");
            System.out.println("-----------------------------------");
            // Login page is Extra Features.
            System.out.println("======== Login page ========");
            System.out.print("Please input your username: ");
            String username = loginsc.nextLine();
            System.out.print("Please input your password: ");
            String password = loginsc.nextLine();
            if (username.equals("admin") && password.equals("letmein")) {
                System.out.println("======== Welcome! ========");
                System.out.println("--------------------------");
                return true;
            } else if (username.equals("user") && password.equals("1234")) {
                System.out.println("======== Welcome! ========");
                System.out.println("--------------------------");
                return false;
            } else {
                System.out.println("Wrong! You have " + attemptCount + " times left");
                attemptCount--;
            }
        }
        if (attemptCount == -1) {
            System.out.println("====You are locked!!!====");
            System.out.println("Please try later!");
            System.exit(0);
        }
        return false;
    }
}
