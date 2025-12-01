package Model;

public class Review {

    private int rating;
    private String feedback;
    private Race race;

    public Review(Race race, Racer first, Racer second, Racer third){
        this.race = race;
        this.feedback = "1st: " + first + "\n2nd: " + second + "\n3rd: " + third;
    }
}
