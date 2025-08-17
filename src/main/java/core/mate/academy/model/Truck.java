package core.mate.academy.model;

public class Truck extends Machine {
    private int maximumLoad;

    public Truck() {
    }

    public Truck(int maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public int getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(int maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
