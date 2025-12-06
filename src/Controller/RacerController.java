package Controller;

import Model.Race;
import Model.Racer;
import Model.License;
import Model.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class RacerController {

    private ArrayList<Racer> racers = new ArrayList<>();
    private ArrayList<License> licenses = new ArrayList<>();

    public void registerRacer(Racer racer) {
        for (Racer r : racers) {
            if (r.getUsername().equals(racer.getUsername())) {
                return; // Racer already exists
            }
        }
        racers.add(racer);
    }

    public Racer getRacerByUsername(String username) {
        for (Racer r : racers) {
            if (r.getUsername().equals(username)) {
                return r;
            }
        }
        return null;
    }

    public boolean registerForRace(Racer racer, Race race) {
        // 1. License check
        if (!racer.hasValidLicense()) {
            return false;
        }

        // 2. Category check
        if (race.getReqCat() < racer.getCategory()) {
            return false;
        }

        // 3. Seat availability
        if (race.isFull()) {
            return false;
        }

        // 4. Register racer
        race.addParticipant(racer);
        racer.addRace(race);

        return true;
    }
}
