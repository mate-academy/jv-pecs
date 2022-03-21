package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private int power;

    public Excavator() {
    }

    public String getCapacity() {
        return model;
    }

    public void setCapacity(String model) {
        this.model = model;
    }

    public int getEngine() {
        return power;
    }

    public void setEngine(int power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
