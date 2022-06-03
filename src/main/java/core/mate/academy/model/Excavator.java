package core.mate.academy.model;

public class Excavator extends Machine {
    private int shovelSize;

    public Excavator() {
    }

    public Excavator(int shovelSize) {
        this.shovelSize = shovelSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
