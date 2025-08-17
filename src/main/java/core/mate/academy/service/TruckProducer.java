package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer extends Truck implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        trucks.add(firstTruck);
        trucks.add(secondTruck);
        return trucks;
    }
}
