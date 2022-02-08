package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String owner;
    private int volume;

    public Truck() {
    }

    public Truck(String owner, int volume) {
        this.owner = owner;
        this.volume = volume;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    String getOwner() {
        return owner;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
