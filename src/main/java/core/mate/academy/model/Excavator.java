package core.mate.academy.model;

public class Excavator extends Machine {
    private String engine;

    public Excavator() {
    }

    public Excavator(String name, String color, String engine) {
        setName(name);
        setColor(color);
        this.engine = engine;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
