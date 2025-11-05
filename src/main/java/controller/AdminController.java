
package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;
import model.License;

public class AdminController {
    private final List<User> users = new ArrayList<>();
    private final List<License> licenses = new ArrayList<>();

    public boolean createUser() {
        // TODO
        return false;
    }

    public boolean removeUser() {
        // TODO
        return false;
    }

    public List<License> viewAllLicenses() {
        return new ArrayList<>(licenses);
    }

    public void removeLicense() {
        // TODO
    }

    public void shutdownSystem() {
        // TODO
    }
}
