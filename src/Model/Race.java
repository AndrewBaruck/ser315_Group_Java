package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Race {

    private double distance;
    private int participationLimit;
    private String type;
    private LocalDate raceDate;
    private LocalDate regDeadline;
    private boolean official;
    private int reqCat;
    private String route;
    private int ID;
    private String name;
    private int currParticipants;
    private List<Racer> participants = new ArrayList<>();


    public static class Builder{
        private final double distance;
        private int participationLimit;
        private String type;
        private LocalDate raceDate;
        private LocalDate regDeadline;
        private boolean official;
        private int reqCat;
        private String route;
        private int ID;
        private String name;

        public Builder(double distance) {
            this.distance = distance;
        }
        public Builder participationLimit(int participationLimit) {
            this.participationLimit = participationLimit;
            return this;
        }
        public Builder type(String type) {
            this.type = type;
            return this;
        }
        public Builder raceDate(LocalDate raceDate) {
            this.raceDate = raceDate;
            return this;
        }
        public Builder regDeadline(LocalDate regDeadline) {
            this.regDeadline = regDeadline;
            return this;
        }
        public Builder official(boolean official) {
            this.official = official;
            return this;
        }
        public Builder reqCat(int reqCat) {
            this.reqCat = reqCat;
            return this;
        }
        public Builder route(String route) {
            this.route = route;
            return this;
        }
        public Builder ID(int ID) {
            this.ID = ID;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Race build() {
            return new Race(this);
        }

    }

    private Race(Builder builder){
        this.distance = builder.distance;
        this.participationLimit = builder.participationLimit;
        this.type = builder.type;
        this.raceDate = builder.raceDate;
        this.regDeadline = builder.regDeadline;
        this.official = builder.official;
        this.reqCat = builder.reqCat;
        this.route = builder.route;
        this.ID = builder.ID;
        this.name = builder.name;
    }

    public static List<Race> getDummyRaces() {
        List<Race> races = new ArrayList<>();

        races.add(new Race.Builder(25.0)
                .participationLimit(20)
                .type("Road Race")
                .raceDate(LocalDate.of(2025, 12, 10))
                .regDeadline(LocalDate.of(2025, 12, 1))
                .official(true)
                .reqCat(5)
                .route("Route A")
                .ID(1)
                .name("Desert Classic Road Race")
                .build()
        );

        races.add(new Race.Builder(12.0)
                .participationLimit(15)
                .type("Criterium")
                .raceDate(LocalDate.of(2025, 12, 15))
                .regDeadline(LocalDate.of(2025, 12, 5))
                .official(true)
                .reqCat(4)
                .route("Route B")
                .ID(2)
                .name("Downtown Criterium")
                .build()
        );

        races.add(new Race.Builder(40.0)
                .participationLimit(30)
                .type("Gravel")
                .raceDate(LocalDate.of(2025, 12, 20))
                .regDeadline(LocalDate.of(2025, 12, 10))
                .official(false)
                .reqCat(5)
                .route("Route C")
                .ID(3)
                .name("Canyon Gravel Ride")
                .build()
        );

        return races;
    }

    public boolean isFull() {
        return participants.size() >= participationLimit;
    }

    public void addParticipant(Racer racer) {
        participants.add(racer);
    }


    public double getDistance(){
        return this.distance;
    }
    public int getParticipationLimit(){ return this.participationLimit; }
    public String getType(){
        return this.type;
    }
    public LocalDate getRaceDate(){
        return this.raceDate;
    }
    public LocalDate getRegDeadline(){ return this.regDeadline; }
    public boolean isOfficial(){ return this.official; }
    public int getReqCat(){ return this.reqCat; }
    public String getRoute() { return this.route; }
    public int getId(){ return this.ID; }
    public String getName(){ return this.name; }
    public int  getCurrParticipants(){ return this.currParticipants; }
    public void  addCurrParticipants(){ currParticipants++; }

}
