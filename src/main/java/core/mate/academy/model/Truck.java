package core.mate.academy.model;

public class Truck extends Machine {
    private int volumeOfTheTank;
    private int loadCapacity;

    public Truck() {
    }

    public int getVolumeOfTheTank() {
        return volumeOfTheTank;
    }

    public void setVolumeOfTheTank(int volumeOfTheTank) {
        this.volumeOfTheTank = volumeOfTheTank;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
