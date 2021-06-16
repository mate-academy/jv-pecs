package core.mate.academy.model;

public class Excavator extends Machine {
    public Excavator() {
    }

    public Excavator(String color, String name) {
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
