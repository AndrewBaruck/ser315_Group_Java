package Controller;

import Model.Admin;
import Model.License;
import Model.User;

import java.util.ArrayList;

public class AdminController {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<License> licenses = new ArrayList<>();

    public boolean createUser(User user) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                return false;
            }
        }
        users.add(user);
        return true;
    }

    public boolean removeUser(User user) {
        return users.remove(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<License> getLicenses() {
        return licenses;
    }

    public void removeLicense(License license) throws NonExistentLicenseException {
        if (!licenses.remove(license)) {
            throw new NonExistentLicenseException("License does not exist");
        }
    }

    public static class NonExistentLicenseException extends Exception {
        public NonExistentLicenseException(String message) {
            super(message);
        }
    }
}
