package core.mate.academy.model;

public class Excavator extends Machine {
    public Excavator() {
        super("", "", 0);
    }

    public Excavator(String name, String color, int horsePower) {
        super(name, color, horsePower);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
