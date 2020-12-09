package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String trailerName;

    public Truck() {
    }

    public Truck(String trailerName) {
        this.trailerName = trailerName;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getTrailerName() {
        return trailerName;
    }

    public void setTrailerName(String trailerName) {
        this.trailerName = trailerName;
    }
}
