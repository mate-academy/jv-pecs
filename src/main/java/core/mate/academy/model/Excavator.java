package core.mate.academy.model;

public class Excavator extends Machine {
    private int maxLoad;

    public Excavator() {
    }

    public Excavator(String name, String color, int maxLoad) {
        super(name, color);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
