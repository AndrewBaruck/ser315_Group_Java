package Controller;

import Model.Admin;
import Model.License;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class AdminController {
    private ArrayList<User> users;
    private ArrayList<License> licenses;

    public boolean createUser(Admin admin) {
        User user = admin;
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                return false;
            }


        }
        users.add(user);
        return true;
    }
    public boolean removeUser(Admin admin){
        for(User u: users){
            if(u.getUsername().equals(admin.getUsername())){
                users.remove(u);
                return true;
            }
        }
        return false;
    }
    public ArrayList<User> getUsers(){
        return users;
    }
    public ArrayList<License> getLicenses(){
        return licenses;
    }
    public void removeLicense(License license) throws NonExistentLicenseException {
        try{for(License l: licenses){
            if(l.getLicenseID()==(license.getLicenseID())){
                licenses.remove(l);
                break;
            }
        }}
        catch
        (Exception e){
            throw new NonExistentLicenseException("License does not exist");
        }
        
    }

    public static class NonExistentLicenseException extends Exception {
        public NonExistentLicenseException(String message) {
            super(message);
        }
        //Probably excessive but I felt like writing my own exception :)
    }}
