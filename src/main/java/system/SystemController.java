
package system;

import controller.AdminController;
import controller.RaceController;
import controller.RacerController;
import model.User;

public class SystemController {
    private final RaceController raceController = new RaceController();
    private final RacerController racerController = new RacerController();
    private final AdminController adminController = new AdminController();

    public void initializeSystem() {
        // TODO: load data, wire repos/services, etc.
    }

    public User login() {
        // TODO: authenticate and return a User
        return null;
    }

    public void logout() {
        // TODO: logout current user
    }

    public void shutdownSystem() {
        // TODO: persist state and cleanup
    }

    public RacerController getRacerController() {
        return racerController;
    }

    public RaceController getOrganizerController() {
        return raceController;
    }

    public AdminController getAdminController() {
        return adminController;
    }
}
