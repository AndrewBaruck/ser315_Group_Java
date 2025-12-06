package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Racer implements User{

    Scanner sc =  new Scanner(System.in);

    private String username = "Racer";
    private String password = "Racer";
    private String fullName = "Racer";
    private int numPodiums;
    private int category = 5;
    private License license;
    private CreditCard creditCard;
    private ArrayList<Race> participatedRaces;
    private List<Race> registeredRaces = new ArrayList<>();

    private Map<Race, Integer> racePositions;

    public Racer(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setCategory(int category){
        this.category = category;
    }
    public String getName(){ return  this.fullName;}
    public CreditCard getCreditCard(){ return this.creditCard; }

    public String reviewRaces(int rating, String feedback){
        String review = "Rating: " + rating + "\nFeedback: " + feedback;
        for (int i = 0; i < this.participatedRaces.size(); i++){
            review += "Race: " + participatedRaces.get(i).getName();
            review += "\nRace ID: " + participatedRaces.get(i).getId();
        }
        return review;
    }

    public License getLicense(){
        return this.license;
    }

    public void registerRace(Race race, String name, CreditCard creditCard, License license){
        if (!license.isValid()){
            System.out.println("Invalid license");
            return;
        } 
        if (race.getReqCat() < this.category){
            System.out.println("Invalid category");
            return;
        } if (race.getParticipationLimit() <= race.getCurrParticipants()){
            System.out.println("No open spots");
            return;
        } else {
            participatedRaces.add(race);
        }
    }
    public int levelUp(){
        if (this.numPodiums >= 3){
            if (this.category > 1){
                this.category--;
            }
        }
        return this.category;
    }
    public void updateLicense(License license){
        this.license = license;
    }
    public String getPassword(){ return this.password; }
    public String getUsername(){ return this.username; }

    public int getCategory(){ return this.category; }
    
    public boolean logIn(){
        String username = sc.nextLine();
        String password = sc.nextLine();

        if (this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        return false;
    }
    public boolean logOut(){
        return false;
    }
    public boolean signUp(){
        System.out.println("Please enter your username: ");
        this.username = sc.nextLine();
        System.out.println("Please enter your password: ");
        this.password = sc.nextLine();
        System.out.println("Please enter your full name: ");
        this.fullName = sc.nextLine();

        return true;
    }

    public boolean hasValidLicense() {
        return this.license != null;
    }

    public void registerLicense(String name, String payment) {
        this.license = new License(name, payment);
    }

    public List<Race> getAvailableRaces() {
        return Race.getDummyRaces();
    }

    public List<Race> getRegisteredRaces() {
        return registeredRaces;
    }

    public void addRace(Race race) {
        if (!registeredRaces.contains(race)) {
            registeredRaces.add(race);
        }
    }



}

