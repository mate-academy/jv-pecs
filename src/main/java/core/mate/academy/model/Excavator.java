package core.mate.academy.model;

public class Excavator extends Machine {
    private int maxSpeed;

    public Excavator() {
    }

    public Excavator(String name, String color, int maxSpeed) {
        super(name, color);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
