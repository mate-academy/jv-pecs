package core.mate.academy.model;

public class Excavator extends Machine {
    private int capacity;

    public Excavator() {
    }

    public Excavator(String name, String color, int capacity) {
        this.setName(name);
        this.setColor(color);
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getCapacity() {
        return capacity;
    }
}
