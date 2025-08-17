package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxMass;

    public Truck() {
    }

    public Truck(int maxMass, String name) {
        this.maxMass = maxMass;
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Truck beeps");
    }
}
