
package model;

import java.time.LocalDate;

public class Organizer implements User {
    private String username;
    private String password;

    public void setRegLimit(int limit) { /* TODO */ }

    public void createRace(double distance, int limit, String type, LocalDate raceDay,
                           LocalDate deadline, boolean official, int cat, String route) { /* TODO */ }

    public void updateRace(double distance, int limit, String type, LocalDate raceDay,
                           LocalDate deadline, boolean official, int cat, String route) { /* TODO */ }

    public void enterResults(String firstRacerName, String secondRacerName, String thirdRacerName) { /* TODO */ }

    @Override public String getPassword() { return password; }
    @Override public String getUserName() { return username; }
    @Override public boolean login() { return false; }
    @Override public boolean logout() { return false; }
    @Override public void signup() { /* TODO */ }
}
