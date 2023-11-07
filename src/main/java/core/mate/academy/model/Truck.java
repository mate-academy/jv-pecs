package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private boolean hasTrailer;

    public Truck() {

    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
