package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int capacity;
    private String model;

    public Excavator() {
    }

    public Excavator(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getType() {
        return model;
    }

    public void setType(String type) {
        this.model = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
