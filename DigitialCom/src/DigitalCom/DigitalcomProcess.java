package DigitalCom;

import java.util.Scanner;

public class DigitalcomProcess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User();
        GameService gs = new GameService();

        int choice;
        boolean isRegistered = false;
        boolean isValid = false;

        while (true) {
            System.out.println("\n1. Register User");
            System.out.println("2. View Games");
            System.out.println("3. Search Game By Author");
            System.out.println("4. Exit");

            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {

                case 1:
                    System.out.print("Enter your username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter your password: ");
                    String pass = sc.nextLine();

                    user.addUser(username, pass);

                    if (user.isAuthenticated(username, pass)) {
                        isValid = true;
                        isRegistered = true;
                        System.out.println("Registration successful!");
                    } else {
                        System.out.println("Authentication failed!");
                    }
                    break;

                case 2:
                    if (!isRegistered) {
                        System.out.println("Register first.");
                    } else if (!isValid) {
                        System.out.println("Not a valid user.");
                    } else {
                        System.out.println(gs.viewAll());
                    }
                    break;

                case 3:
                    if (!isRegistered) {
                        System.out.println("Register first.");
                    } else if (!isValid) {
                        System.out.println("Not a valid user.");
                    } else {
                        System.out.print("Enter author name: ");
                        String author = sc.nextLine();
                        String result = gs.authorSearch(author);
                        System.out.println(result);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}