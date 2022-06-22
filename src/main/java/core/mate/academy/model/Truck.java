package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int weightInTons;
    private int salaryForDistance;

    public Truck() {
    }

    public Truck(String name, String color, int weightInTons, int salaryForDistance) {
        this.weightInTons = weightInTons;
        this.salaryForDistance = salaryForDistance;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
