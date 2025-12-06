package Controller;

import Model.User;
import Model.Admin;
import Model.Organizer;
import Model.Racer;
import View.AdminUI;
import View.OrganizerUI;
import View.RacerUI;
import View.RoleUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemController {
    private RacerController racerController;
    private RaceController raceController;
    private AdminController adminController;
    private RoleUI activeUI;
    private List<User> users = new ArrayList<>();

    public SystemController() {
        this.racerController = new RacerController();
        this.raceController = new RaceController();
        this.adminController = new AdminController();
        // Dummy accounts
        users.add(new Admin("admin1", "pass"));
        users.add(new Organizer("org1", "pass"));
        users.add(new Racer("racer1", "pass"));
    }

    /**
     * Selects the appropriate UI Strategy based on the type of User
     * and starts the role-specific UI.
     */
    public void start() {
        Scanner sc = new Scanner(System.in);
        User loggedInUser = null;

        // Show login menu only until successful login
        while (loggedInUser == null) {
            System.out.println("1. Login");
            System.out.println("2. Sign Up");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                loggedInUser = handleLogin(sc);
                if (loggedInUser == null) {
                    System.out.println("Invalid credentials.");
                }
            } else if (choice == 2) {
                // implement signup later
                System.out.println("Sign up not yet implemented.");
            }
        }
        // Now show the proper UI for the logged-in user
        showRoleUI(loggedInUser);
        // Only return here if the selected UI finishes (user logs out)
    }


    /**
     * Strategy selection logic: choose which UI implementation to use.
     */
    public void showRoleUI(User user) {
        RoleUI ui;

        if (user instanceof Admin) {
            ui = new AdminUI();
        } else if (user instanceof Organizer) {
            ui = new OrganizerUI();
        } else {
            ui = new RacerUI();
        }
        ui.showRoleMenu(user); // Does not return until user logs out
    }


    public int shutDown(){
        return -1;
    }

    public User login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null; // Login failed
    }

    private User handleLogin(Scanner sc) {
        System.out.print("Please enter username: ");
        String username = sc.nextLine();

        System.out.print("Please enter password: ");
        String password = sc.nextLine();

        return login(username, password);
    }



    public RacerController getRacerController() {
        return this.racerController;
    }
    public RaceController getRaceController() {
        return this.raceController;
    }
    public AdminController getAdminController() {
        return this.adminController;
    }


}