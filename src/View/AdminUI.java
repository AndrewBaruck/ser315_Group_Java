package View;

import Controller.SystemController;
import Model.Admin;
import Model.User;

import java.util.Scanner;

public class AdminUI implements RoleUI {

    private final Scanner input = new Scanner(System.in);

    @Override
    public void showRoleMenu(User user, SystemController controller) {
        Admin admin = (Admin) user;

        while (true) {
            System.out.println("===== Admin Menu =====");
            System.out.println("1) View Users");
            System.out.println("2) View Licenses");
            System.out.println("3) Logout");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Viewing users (not fully implemented yet).");
            } else if (choice == 2) {
                System.out.println("Viewing licenses (not fully implemented yet).");
            } else if (choice == 3) {
                System.out.println("Logging out...");
                return;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
