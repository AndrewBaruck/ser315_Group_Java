package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Organizer implements User {

    private String username;
    private String password;
    private String fullName;
    private List<Race> races = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public Organizer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void createRace(double dist, int limit, String type, LocalDate raceDay,
                           LocalDate deadline, boolean official, int cat, String route, int ID, String name) {

        races.add(new Race.Builder(dist)
                .participationLimit(limit)
                .type(type)
                .raceDate(raceDay)
                .regDeadline(deadline)
                .official(official)
                .reqCat(cat)
                .route(route)
                .ID(ID)
                .name(name)
                .build()
        );
    }

    /**
     * Placeholder for race updates.
     * With the current Race design (Builder + getters, no setters),
     * races are effectively immutable after creation.
     */
    public void updateRace(Race race) {
        System.out.println("Update race feature is not implemented in this version.");
    }

    public void enterResults(Race race, Racer first, Racer second, Racer third) {
        Review review = new Review(race, first, second, third);
        // You can store or print the review as needed.
    }

    // These login / signup methods are not used by SystemController,
    // but are left here for completeness.

    public boolean logIn() {
        String usernameInput = sc.nextLine();
        String passwordInput = sc.nextLine();

        return this.username.equals(usernameInput) && this.password.equals(passwordInput);
    }

    public boolean logOut() {
        return false;
    }

    public boolean signUp() {
        System.out.println("Please enter your username: ");
        this.username = sc.nextLine();
        System.out.println("Please enter your password: ");
        this.password = sc.nextLine();
        System.out.println("Please enter your full name: ");
        this.fullName = sc.nextLine();

        return true;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }
}
