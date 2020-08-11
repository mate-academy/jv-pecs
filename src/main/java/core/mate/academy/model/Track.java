package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int wheelsAmount;
    private String trailerType;

    public Track() {
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public String getTrailerType() {
        return trailerType;
    }
}
