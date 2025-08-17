package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfMovement;
    private String lastDriverName;

    public Excavator() {
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }

    public String getLastDriverName() {
        return lastDriverName;
    }

    public void setLastDriverName(String lastDriverName) {
        this.lastDriverName = lastDriverName;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
