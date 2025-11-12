package Model;

import java.time.LocalDate;

public class Organizer implements User{

    private String username;
    private String password;
    private String fullName;

    public void createRace(double dist, int limit, String type, LocalDate raceDay,
                      LocalDate deadline, boolean official, int cat, String route){

    }
    public void updateRace(){

    }
    public void enterResults(Racer first, Racer second,  Racer third){

    }

    public String getPassword(){
        return "organizer";
    }
    public String getUsername(){
        return "organizer";
    }
    public boolean logIn(){
        return false;
    }
    public boolean logOut(){
        return false;
    }
    public boolean signUp(){
        return false;
    }
}
