package core.mate.academy.model;

public class Excavator extends Machine {
    private String type;

    public Excavator() {
    }

    public Excavator(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
