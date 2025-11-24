package View;

import Model.Organizer;
import Model.User;

/**
 * Organizer-specific UI for Strategy implementation).
 */
public class OrganizerUI implements RoleUI {

    @Override
    public void showRoleMenu(User user) {
        Organizer organizer = (Organizer) user;

        System.out.println("===== Organizer Menu =====");
        System.out.println("1) Create Race");
        System.out.println("2) Enter Results");
        System.out.println("3) Logout");
        // TODO: add Scanner input and delegate to RaceController later
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