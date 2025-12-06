package View;

import Model.Organizer;
import Controller.SystemController;
import Model.User;

import java.util.Scanner;

/**
 * Organizer-specific UI for Strategy implementation).
 */
public class OrganizerUI implements RoleUI {

    private final Scanner input = new Scanner(System.in);

    @Override
    public void showRoleMenu(User user, SystemController controller) {
        Organizer organizer = (Organizer) user;

        while (true) {
            System.out.println("===== Organizer Menu =====");
            System.out.println("1) Create Race");
            System.out.println("2) View Races");
            System.out.println("3) Logout");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Create race (not fully implemented yet).");
            } else if (choice == 2) {
                System.out.println("View races (not fully implemented yet).");
            } else if (choice == 3) {
                System.out.println("Logging out...");
                return;
            } else {
                System.out.println("Invalid choice. Try again.");
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