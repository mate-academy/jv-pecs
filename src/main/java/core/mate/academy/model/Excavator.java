package core.mate.academy.model;

public class Excavator extends Machine {
    private int enginePower;
    private String engine;

    public Excavator() {
    }

    public Excavator(String engine, int enginePower) {
        this.engine = engine;
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
