package Controller;

import Model.User;
import Model.Admin;
import Model.Organizer;
import Model.Racer;
import View.AdminUI;
import View.OrganizerUI;
import View.RacerUI;
import View.RoleUI;

public class SystemController {
    private RacerController racerController;
    private RaceController raceController;
    private AdminController adminController;
    private RoleUI activeUI;

    public SystemController() {
        this.racerController = new RacerController();
        this.raceController = new RaceController();
        this.adminController = new AdminController();
    }

    /**
     * Selects the appropriate UI Strategy based on the type of User
     * and starts the role-specific UI.
     */
    public void startSession(User user) {
        this.activeUI = createRoleUI(user);
        activeUI.showRoleMenu(user);
    }

    /**
     * Strategy selection logic: choose which UI implementation to use.
     */
    private RoleUI createRoleUI(User user) {
        if (user instanceof Racer) {
            return new RacerUI();
        } else if (user instanceof Admin) {
            return new AdminUI();
        } else if (user instanceof Organizer) {
            return new OrganizerUI();
        } else {
            throw new IllegalArgumentException("Unsupported user type: " + user.getClass());
        }
    }


    public int shutDown(){
        return -1;
    }

    public User login(){
        return null;
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
