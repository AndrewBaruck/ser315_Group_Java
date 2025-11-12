package Controller;

import Model.User;

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
