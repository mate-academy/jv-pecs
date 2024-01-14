package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeOfDump;

    public Truck() {
    }

    public Truck(String typeOfDump) {
        this.typeOfDump = typeOfDump;
    }

    public String getTypeOfDump() {
        return typeOfDump;
    }

    public void setTypeOfDump(String typeOfDump) {
        this.typeOfDump = typeOfDump;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
