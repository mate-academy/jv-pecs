package core.mate.academy.model;

public class Truck extends Machine {
    private int numberOfWheels;
    private boolean isAutomatedLoaders;

    public Truck(int numberOfWheels, boolean isAutomatedLoaders) {
        this.numberOfWheels = numberOfWheels;
        this.isAutomatedLoaders = isAutomatedLoaders;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isAutomatedLoaders() {
        return isAutomatedLoaders;
    }

    public void setAutomatedLoaders(boolean automatedLoaders) {
        isAutomatedLoaders = automatedLoaders;
    }
}
