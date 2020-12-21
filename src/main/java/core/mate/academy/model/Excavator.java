package core.mate.academy.model;

public class Excavator extends Machine {
    private boolean hasLadle;

    public Excavator(boolean hasLadle, String name, String color) {
        super(name, color);
        this.hasLadle = hasLadle;
    }

    public Excavator() {
    }

    public boolean isHasLadle() {
        return hasLadle;
    }

    public void setHasLadle(boolean hasLadle) {
        this.hasLadle = hasLadle;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
