package Model;

import java.time.LocalDate;

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
