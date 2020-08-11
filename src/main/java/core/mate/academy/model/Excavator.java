package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfChassis;
    private int ladleCapacity;

    public Excavator(String typeOfChassis, int ladleCapacity) {
        this.typeOfChassis = typeOfChassis;
        this.ladleCapacity = ladleCapacity;
    }

    public Excavator() {
    }

    public String getTypeOfChassis() {
        return typeOfChassis;
    }

    public void setTypeOfChassis(String typeOfChassis) {
        this.typeOfChassis = typeOfChassis;
    }

    public int getLadleCapacity() {
        return ladleCapacity;
    }

    public void setLadleCapacity(int ladleCapacity) {
        this.ladleCapacity = ladleCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
