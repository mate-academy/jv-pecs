package core.mate.academy.model;

public class Truck extends Machine {
    private int maxLoad;

    public Truck(String name, int year, int maxLoad) {
        super(name, year);
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
        System.out.println("Truck started to work");
    }
}
