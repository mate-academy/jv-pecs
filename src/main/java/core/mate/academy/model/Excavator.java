package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean electricDrive;
    private int wheelAxles;

    public Excavator() {
    }

    public Excavator(String name, String color, int wheelAxles, boolean electricDrive) {
        this.setName(name);
        this.setColor(color);
        this.wheelAxles = wheelAxles;
        this.electricDrive = electricDrive;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
