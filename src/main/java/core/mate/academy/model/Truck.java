package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String dumpBoxType;

    public Truck() {
    }

    public String getDumpBoxType() {
        return dumpBoxType;
    }

    public void setDumpBoxType(String dumpBoxType) {
        this.dumpBoxType = dumpBoxType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
