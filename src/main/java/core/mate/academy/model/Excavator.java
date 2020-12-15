package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private Chassis chassis;

    public Excavator(){

    }

    public Excavator(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public Chassis getChassis() {
        return chassis;
    }
}
