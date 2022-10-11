package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfExcavator;
    private String typeOfRunningGear;

    public Excavator() {
    }

    public Excavator(String name, String color, String typeOfExcavator, String typeOfRunningGear) {
        this.setName(name);
        this.setColor(color);
        this.typeOfExcavator = typeOfExcavator;
        this.typeOfRunningGear = typeOfRunningGear;

    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getTypeOfExcavator() {
        return typeOfExcavator;
    }

    public void setTypeOfExcavator(String typeOfExcavator) {
        this.typeOfExcavator = typeOfExcavator;
    }

    public String getTypeOfRunningGear() {
        return typeOfRunningGear;
    }

    public void setTypeOfRunningGear(String typeOfRunningGear) {
        this.typeOfRunningGear = typeOfRunningGear;
    }
}
