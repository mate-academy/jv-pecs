package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Machine {
    private static final String TRUCK_UNIQUE_FIELD = "Truck";
    private List<Truck> truckStorage = new ArrayList<>();

    public Truck() {
    }

    public List<Truck> readStorage() {
        return truckStorage;
    }

    public void putItemToStorage(Truck truck) {
        truckStorage.add(truck);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
