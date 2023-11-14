package core.mate.academy.model;

public class Excavator extends Machine {
    private String type;
    private int capacity;

    public Excavator() {
    }

    public Excavator(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
