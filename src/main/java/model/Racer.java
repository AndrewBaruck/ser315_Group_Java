
package model;

import java.util.*;

public class Racer implements User {
    private String username;
    private String password;
    private int Category;
    private int numPodiums;
    private License License;
    private String Name;
    private CreditCard Card;
    private ArrayList<Race> participatedRaces = new ArrayList<>();
    private Map<Race, Integer> racePositions = new HashMap<>();

    public String reviewRaces(int Rating, String feedback) { return null; }

    public License submitSignUp(String name, CreditCard card) { return null; }

    public void registerRace(String name, CreditCard card, License license) { /* TODO */ }

    public int racerLevelUp(int numPodiums, int cat) { return cat; }

    @Override public String getPassword() { return password; }
    @Override public String getUserName() { return username; }
    @Override public boolean login() { return false; }
    @Override public boolean logout() { return false; }
    @Override public void signup() { /* TODO */ }
}
