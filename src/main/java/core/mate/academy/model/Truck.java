package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int towingCapacity;
    private List<Truck> listOfTrucks = new ArrayList<>();

    public Truck() {
    }

    public Truck(String name, String color, int towingCapacity) {
        super(name, color);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        TruckSupplier truck = new TruckSupplier();
        for (int i = 0; i < 4; i++) {
            listOfTrucks.add(truck.getTruck());
        }
        return listOfTrucks;
    }
}
