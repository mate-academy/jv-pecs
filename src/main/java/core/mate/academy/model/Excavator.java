package core.mate.academy.model;

public class Excavator extends Machine {
    private String engine;

    public Excavator() {
    }

    public Excavator(String engine) {
        this.engine = engine;
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
