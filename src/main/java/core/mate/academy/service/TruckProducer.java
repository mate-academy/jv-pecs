package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        // Додамо об'єкти Truck до списку
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        trucks.add(truck1);
        trucks.add(truck2);

        return trucks;
    }
}
