package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int speed;

    public Excavator(){
    }

    public Excavator(String name, String color, int speed) {
        super(name, color);
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
