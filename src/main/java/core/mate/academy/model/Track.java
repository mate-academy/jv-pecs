package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int enginePower;
    private int brakingDistances;

    public Track() {
    }

    public Track(int enginePower, int brakingDistances) {
        this.enginePower = enginePower;
        this.brakingDistances = brakingDistances;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getBrakingDistances() {
        return brakingDistances;
    }

    public void setBrakingDistances(int brakingDistances) {
        this.brakingDistances = brakingDistances;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
