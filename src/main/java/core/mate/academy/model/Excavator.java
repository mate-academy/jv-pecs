package core.mate.academy.model;

public class Excavator extends Machine {
    private int power;

    public Excavator() {
    }

    public Excavator(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
