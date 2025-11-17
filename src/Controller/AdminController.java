package Controller;

import Model.License;
import Model.User;

import java.util.ArrayList;

public class AdminController {
    private ArrayList<User> users;
    private ArrayList<License> licenses;

    public boolean createUser(){
        return false;
    }
    public boolean removeUser(){
        return false;
    }
    public ArrayList<User> getUsers(){
        return users;
    }
    public ArrayList<License> getLicenses(){
        return licenses;
    }
    public void removeLicense(){

    }
}
