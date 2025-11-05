
package model;

import java.time.LocalDate;

public class Race {
    private double Distance;
    private int ParticipationLimit;
    private String RaceType;
    private LocalDate RaceDay;
    private LocalDate RegDeadline;
    private boolean Official;
    private int RequiredCat;
    private String Route;
    private String Name;

    public String getRoute() { return Route; }
    public double getDistance() { return Distance; }
    public String getName() { return Name; }
    public String getType() { return RaceType; }
    public LocalDate getRegDeadline() { return RegDeadline; }
    public LocalDate getRaceDay() { return RaceDay; }
    public boolean getOfficial() { return Official; }
    public int getCat() { return RequiredCat; }
}
