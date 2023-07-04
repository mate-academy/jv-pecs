package core.mate.academy.model;

public class Excavator extends Machine {
    private int dipperSize;

    public Excavator() {
    }

    public int getDipperSize() {
        return dipperSize;
    }

    public void setDipperSize(int dipperSize) {
        this.dipperSize = dipperSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
