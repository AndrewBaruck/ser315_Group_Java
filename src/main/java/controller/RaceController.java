
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Race;
import model.Organizer;

public class RaceController {
    private final List<Race> races = new ArrayList<>();
    private final List<Organizer> organizers = new ArrayList<>();

    public void createRace() {
        // TODO: create a race
    }

    public void enterResults() {
        // TODO: enter results
    }

    public List<Race> getRacesByType() {
        // TODO: filter by type
        return new ArrayList<>(races);
    }

    public List<Race> getUpcomingRaces() {
        // TODO: filter by date
        return new ArrayList<>(races);
    }
}
