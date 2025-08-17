package core.mate.academy.model;

public class Truck extends Machine {
    private boolean isLoaded;

    public Truck() {
    }

    public Truck(String name, String colour, boolean isLoaded) {
        this.setName(name);
        this.setColor(colour);
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
