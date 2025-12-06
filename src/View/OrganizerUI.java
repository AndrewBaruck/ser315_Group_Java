package View;

import Model.Organizer;
import Model.User;

import java.util.Scanner;

/**
 * Organizer-specific UI for Strategy implementation).
 */
public class OrganizerUI implements RoleUI {

    @Override
    public void showRoleMenu(User user) {
        Scanner sc = new Scanner(System.in);
        Organizer organizer = (Organizer) user;

        while (true) {
            System.out.println("===== Organizer Menu =====");
            System.out.println("1) Create Race");
            System.out.println("2) Enter Results");
            System.out.println("3) Logout");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) {
                System.out.println("Logging out...");
                return; // goes back to start() after login section
            }
        }
    }


    public void createRace() {
        // TODO
    }

    public void enterResults() {
        // TODO
    }

    public String getMessage() {
        return "";
    }

    public void setMessage(String message) {

    }

    public void displayMessage() {

    }
}