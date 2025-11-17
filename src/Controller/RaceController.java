package Controller;

import Model.Organizer;
import Model.Race;

import java.util.ArrayList;

public class RaceController {
    private ArrayList<Race> races;
    private ArrayList<Organizer> organizers;

    public void createRaces(Race race){
        for(Race r:races){
            if(r.getId()==race.getId()){
                break;
            }
        }
        races.add(race);
    }
    public void enterResults(int raceId){
        for(Race r:races){
            if(r.getId()==raceId){
                //race set results logic, race class not complete

            }
        }
    }
    public  ArrayList<Race> getRaces(){
        return races;
    }
    public ArrayList<Race> racesByType(String type){
        ArrayList<Race> sortedRaces = new ArrayList<>();
        for(Race r:races){
            if(r.getType().equals(type)){
                sortedRaces.add(r);
            }
        }
        return sortedRaces;
    }
    public void getResults(Race race){
        //race set results logic, race class not complete
    }
}
