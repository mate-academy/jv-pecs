package core.mate.academy.model;

public class Excavator extends Machine {
    private int dipperCapacity;

    public Excavator() {
    }

    public int getDipperCapacity() {
        return dipperCapacity;
    }

    public void setDipperCapacity(int dipperCapacity) {
        this.dipperCapacity = dipperCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
