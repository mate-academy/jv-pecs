package core.mate.academy.model;

public class Excavator extends Machine {
    private int excavatorHeight;

    public Excavator() {
    }

    public Excavator(int excavatorHeight) {
        this.excavatorHeight = excavatorHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getExcavatorHeight() {
        return excavatorHeight;
    }

    public void setExcavatorHeight(int excavatorHeight) {
        this.excavatorHeight = excavatorHeight;
    }
}
