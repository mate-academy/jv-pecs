package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorYear;

    public Excavator() {
    }

    public Excavator(String name,String color, int excavatorYear) {
        super(name, color);
        this.excavatorYear = excavatorYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
