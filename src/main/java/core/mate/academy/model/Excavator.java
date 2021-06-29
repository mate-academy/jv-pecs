package core.mate.academy.model;

public class Excavator extends Machine {
    private int maxWorkDepth;
    private int shovelSize;

    public Excavator() {
    }

    public void setMaxWorkDepth(int maxWorkDepth) {
        this.maxWorkDepth = maxWorkDepth;
    }

    public void setShovelSize(int shovelSize) {
        this.shovelSize = shovelSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
