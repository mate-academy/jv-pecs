package core.mate.academy.model;

public class Excavator extends Machine {
    private int power;

    public Excavator() {
    }

    public Excavator(String name, String color, int power) {
        super(name, color);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
