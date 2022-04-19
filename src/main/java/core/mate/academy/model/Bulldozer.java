package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private String engineModel;
    private int powerNet;

    public Bulldozer(String engineModel, int powerNet) {
        this.engineModel = engineModel;
        this.powerNet = powerNet;
    }

    public Bulldozer() {
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getPowerNet() {
        return powerNet;
    }

    public void setPowerNet(int powerNet) {
        this.powerNet = powerNet;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
