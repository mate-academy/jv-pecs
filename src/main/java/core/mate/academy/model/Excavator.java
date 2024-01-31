package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeOfAssignment;
    private String typeOfChassis;
    private String typeOfEngine;

    public Excavator(String name, String color, String typeOfAssignment,
                     String typeOfChassis, String typeOfEngine) {
        super(name, color);
        this.typeOfAssignment = typeOfAssignment;
        this.typeOfChassis = typeOfChassis;
        this.typeOfEngine = typeOfEngine;
    }

    public Excavator() {
    }

    public String getTypeOfAssignment() {
        return typeOfAssignment;
    }

    public void setTypeOfAssignment(String typeOfAssignment) {
        this.typeOfAssignment = typeOfAssignment;
    }

    public String getTypeOfChassis() {
        return typeOfChassis;
    }

    public void setTypeOfChassis(String typeOfChassis) {
        this.typeOfChassis = typeOfChassis;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
