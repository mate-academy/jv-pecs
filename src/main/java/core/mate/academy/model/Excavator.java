package core.mate.academy.model;

public class Excavator extends Machine {

    private int widthLadle;

    public Excavator() {
    }

    public Excavator(String name, String color, int widthLadle) {
        super(name, color);
        this.widthLadle = widthLadle;
    }

    public int getWidthLadle() {
        return widthLadle;
    }

    public void setWidthLadle(int widthLadle) {
        this.widthLadle = widthLadle;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
