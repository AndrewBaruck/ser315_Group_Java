package Controller;

import Model.Racer;
import Model.User;

import java.util.ArrayList;

public class SystemController {
    private RacerController racerController;
    private RaceController raceController;
    private AdminController adminController;

    public SystemController() {
        this.racerController = new RacerController();
        this.raceController = new RaceController();
        this.adminController = new AdminController();
    }

    public int shutDown(){
        return -1;
    }

    public User login(String[] creds){


       ArrayList<User> users = adminController.getUsers();
        for(User r:users){
            if(r.getUsername().equals(creds[0]) && r.getPassword().equals(creds[1])){
                return r;
            }
        }
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
