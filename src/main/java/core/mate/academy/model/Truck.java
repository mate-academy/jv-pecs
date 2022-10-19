package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double maxSpeed;
    private double maxWeightTonn;
    private String trailerType;

    public Truck(String name, String color,
            double maxSpeed, double maxWeightTonn,
            String trailerType) {
        super(name, color);
        this.maxSpeed = maxSpeed;
        this.maxWeightTonn = maxWeightTonn;
        this.trailerType = trailerType;
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    public Truck() {
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxWeightTonn() {
        return maxWeightTonn;
    }

    public void setMaxWeightTonn(double maxWeightTonn) {
        this.maxWeightTonn = maxWeightTonn;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
