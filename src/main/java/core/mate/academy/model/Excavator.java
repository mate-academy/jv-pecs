package core.mate.academy.model;

public class Excavator extends Machine {
    private int height;

    public Excavator() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
