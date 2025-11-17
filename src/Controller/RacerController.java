package Controller;

import Model.CreditCard;
import Model.License;
import Model.Race;
import Model.Racer;

import java.time.LocalDate;
import java.util.ArrayList;

public class RacerController {
    private ArrayList<Racer> racers;
    private ArrayList<License> licenses;

    public void registerRacer(Racer racer){
        for(Racer r:racers){
            if(r.getUsername()
            .equals(racer.getUsername())){
                break;
            }
        }
        racers.add(racer);
    }
    public void purchaseLicence(String n, CreditCard cc, String uname){
        for(Racer r:racers){
            if(r.getUsername().equals(uname)){
                License license = r.getLicense(n,cc);
                licenses.add(license);
                break;
            }
        }
    }
    public void raceSignUp(int RaceId, String uname){
        int participationLimit;
        LocalDate date;
        int cat;
        Racer thisRacer = null;
        for(Racer r:racers){
            if(r.getUsername().equals(uname)){
                thisRacer = r;
                RaceController raceController = new RaceController();
                ArrayList<Race> races = raceController.getRaces();
                for(Race race:races){
                    if(race.getId()==RaceId){
                        participationLimit = race.getParticipationLimit();
                        date = race.getRegDeadline();
                        cat = race.getReqCat();
                    }
                }
            }
        }
        int counter = 0;
        for(Racer r:racers){
            //ArrayList<Race> pRaces = r.getParticipatedRaces();
            //for(Race r:pRaces){
            //  if (r.getId()==RaceId){
            //      counter++;
            //  }
        }
//        if(counter<participationLimit && thisRacer.getCatergory()>=cat && LocalDate.now().isBefore(date)){
//          thisRacer.registerRace(thisRacer.getFullName(), thisRacer.getCreditCard(), thisRacer.getLicense());
//        }

    }
    public void updateCAT(Racer racer){
//        int podiums = racer.getNumPodiums();
//        int category = racer.getCategory();
//        int newCat = racer.levelUp(podiums, category);
        //racer.setCategory(newCat);
    }

    public ArrayList<Racer> getRacers(){
        return racers;
    }
}
