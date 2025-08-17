package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerModel;
    private double dumpVolume;

    public Bulldozer(String bulldozerName, double dumpVolume) {
        this.bulldozerModel = bulldozerName;
        this.dumpVolume = dumpVolume;
    }

    public Bulldozer() {
    }

    public String getBulldozerName() {
        return bulldozerModel;
    }

    public void setBulldozerName(String bulldozerName) {
        this.bulldozerModel = bulldozerName;
    }

    public double getDumpVolume() {
        return dumpVolume;
    }

    public void setDumpVolume(double dumpLength) {
        this.dumpVolume = dumpVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
