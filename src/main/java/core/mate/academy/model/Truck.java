package core.mate.academy.model;

public class Truck extends Machine {
    private boolean isLoaded;

    public Truck() {
    }

    public Truck(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
