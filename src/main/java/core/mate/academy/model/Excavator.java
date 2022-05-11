package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String type;
    private int capacity;

    public Excavator() {
    }

    public Excavator(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getTyp() {
        return type;
    }

    public void setTyp(String typ) {
        this.type = typ;
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
