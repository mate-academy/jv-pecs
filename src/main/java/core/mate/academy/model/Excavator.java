package core.mate.academy.model;

public class Excavator extends Machine {
    private boolean hasLadle;

    public Excavator(boolean hasLadle, String name, String color) {
        this.hasLadle = hasLadle;
        setName(name);
        setColor(color);
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
