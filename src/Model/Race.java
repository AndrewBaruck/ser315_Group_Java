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


    public double getDistance(){
        return this.distance;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }

    public int getParticipationLimit(){
        return this.participationLimit;
    }
    public void setParticipationLimit(int participationLimit){
        this.participationLimit = participationLimit;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    public LocalDate getRaceDate(){
        return this.raceDate;
    }
    public void setRaceDate(LocalDate raceDate){
        this.raceDate = raceDate;
    }

    public LocalDate getRegDeadline(){
        return this.regDeadline;
    }
    public void setRegDeadline(LocalDate regDeadline){
        this.regDeadline = regDeadline;
    }

    public boolean isOfficial(){
        return this.official;
    }
    public void setOfficial(boolean official){
        this.official = official;
    }

    public int getReqCat(){
        return this.reqCat;
    }
    public void setReqCat(int reqCat){
        this.reqCat = reqCat;
    }

    public String getRoute() {
        return this.route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
}
