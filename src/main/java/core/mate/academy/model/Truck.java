package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int volumeOfCargo;

    public Truck() {
    }

    public Truck(String name, String color, int volumeOfCargo) {
        super(name, color);
        this.volumeOfCargo = volumeOfCargo;
    }

    public int getVolumeOfCargo() {
        return volumeOfCargo;
    }

    public void setVolumeOfCargo(int volumeOfCargo) {
        this.volumeOfCargo = volumeOfCargo;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
