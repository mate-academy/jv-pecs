package core.mate.academy.model;

public class Truck extends Machine {
    private boolean isLoaded;

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
