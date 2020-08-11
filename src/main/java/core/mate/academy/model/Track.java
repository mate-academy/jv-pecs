package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String tireType;
    private String team;
    private double maxSpeed;
    private int mathcesWon;

    public Track() {
    }

    public Track(String tireType, String team, double maxSpeed, int mathcesWon) {
        this.tireType = tireType;
        this.team = team;
        this.maxSpeed = maxSpeed;
        this.mathcesWon = mathcesWon;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double get() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMathcesWon() {
        return mathcesWon;
    }

    public void setMathcesWon(int mathcesWon) {
        this.mathcesWon = mathcesWon;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
