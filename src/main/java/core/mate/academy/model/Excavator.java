package core.mate.academy.model;

public class Excavator extends Machine {

    public Excavator() {
    }

    public Excavator(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
