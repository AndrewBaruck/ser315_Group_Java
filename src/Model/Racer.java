package Model;

import java.util.ArrayList;
import java.util.Map;

public class Racer implements User{

    private String username;
    private String password;
    private String fullName;

    private int numPodiums;
    private int category;
    private License license;
    private CreditCard creditCard;
    private ArrayList<Race> participatedRaces;

    private Map<Race, Integer> racePositions;

//    public Racer(String username, String password){
//        this.username = username;
//    }

    public String reviewRaces(int rating, String feeback){
        return "racer";
    }
    public License getLicense(String name, CreditCard creditCard){
        return license;
    }
    public void registerRace(String name, CreditCard creditCard, License license){

    }
    public int levelUp(int podiums, int category){
        return -1;
    }

    public String getPassword(){
        return "racer";
    }
    public String getUsername(){
        return "racer";
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
