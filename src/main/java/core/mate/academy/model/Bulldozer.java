package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String make;
    private String model;
    private String bulldozerTrack;

    public Bulldozer() {
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getBulldozerTrack() {
        return bulldozerTrack;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBulldozerTrack(String bulldozerTrack) {
        this.bulldozerTrack = bulldozerTrack;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
