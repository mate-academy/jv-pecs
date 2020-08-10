package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int id;

    public Excavator() {
    }

    public Excavator(String name, int id) {
        super.setName(name);
        super.setColor("RED");
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
