package View;

import Model.Admin;
import Model.User;

import java.util.Scanner;

/**
 * Admin-specific UI for Strategy implementation.
 */
public class AdminUI implements RoleUI {

    @Override
    public void showRoleMenu(User user) {
        Scanner sc = new Scanner(System.in);
        Admin admin = (Admin) user;

        while(true) {
            System.out.println("===== Admin Menu =====");
            System.out.println("1) Manage Users");
            System.out.println("2) Manage System");
            System.out.println("3) Logout");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) {
                System.out.println("Logging out...");
                return; // goes back to start() after login section
            }
        }
        // TODO: add input handling and calls to AdminController when ready
    }

    public void manageSystem() {
        // TODO: hook to AdminController
    }
}