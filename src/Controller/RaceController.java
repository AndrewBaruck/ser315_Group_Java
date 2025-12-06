package Controller;

import Model.Race;
import Model.Organizer;

import java.util.ArrayList;
import java.util.List;

public class RaceController {

    private ArrayList<Race> races = new ArrayList<>();
    private ArrayList<Organizer> organizers = new ArrayList<>();

    public RaceController() {
        races.addAll(Race.getDummyRaces());
    }

    public ArrayList<Race> getRaces() {
        return races;
    }

    public Race getRaceById(int id) {
        for (Race r : races) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }
}
