package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfEngine;
    private String typeOfSuspension;
    private String typeOfDestination;

    public Excavator() {
    }

    public Excavator(String typeOfEngine, String typeOfSuspension, String typeOfDestination) {
        this.typeOfEngine = typeOfEngine;
        this.typeOfSuspension = typeOfSuspension;
        this.typeOfDestination = typeOfDestination;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfSuspension() {
        return typeOfSuspension;
    }

    public void setTypeOfSuspension(String typeOfSuspension) {
        this.typeOfSuspension = typeOfSuspension;
    }

    public String getTypeOfDestination() {
        return typeOfDestination;
    }

    public void setTypeOfDestination(String typeOfDestination) {
        this.typeOfDestination = typeOfDestination;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
