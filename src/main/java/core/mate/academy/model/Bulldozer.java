package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String trackName;
    private String cab;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String trackName, String cab) {
        super(name, color);
        this.trackName = trackName;
        this.cab = cab;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }
}
