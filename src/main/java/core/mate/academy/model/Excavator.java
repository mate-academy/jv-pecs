package core.mate.academy.model;

public class Excavator extends Machine {
    private boolean digs;
    private int speed;
    private String color;

    public Excavator() {
    }

    public Excavator(boolean digs, int speed, String color) {
        this.digs = digs;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
