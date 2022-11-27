package core.mate.academy.model;

public class Excavator extends Machine {
    private String engine;
    private int motor;

    public Excavator() {
    }

    public Excavator(String name, String color, String engine, int motor) {
        super(name, color);
        this.engine = engine;
        this.motor = motor;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
}
