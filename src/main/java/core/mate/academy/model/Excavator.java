package core.mate.academy.model;

public class Excavator extends Machine {
    private int excavatorBoom;

    public Excavator() {
    }

    public Excavator(int excavatorBoom) {
        this.excavatorBoom = excavatorBoom;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getExcavatorBoom() {
        return excavatorBoom;
    }

    public void setExcavatorBoom(int excavatorBoom) {
        this.excavatorBoom = excavatorBoom;
    }
}
