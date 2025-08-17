package core.mate.academy.model;

public class Excavator extends Machine {
    private double excavatorCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, double excavatorCapacity) {
        setName(name);
        setColor(color);
        this.excavatorCapacity = excavatorCapacity;
    }

    public double getExcavatorCapacity() {
        return excavatorCapacity;
    }

    public void setExcavatorCapacity(double capacity) {
        this.excavatorCapacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
