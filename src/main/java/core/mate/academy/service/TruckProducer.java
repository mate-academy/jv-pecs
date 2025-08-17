package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("truck1", "yellow", "Gasoline", "Refrigerator"));
        trucks.add(new Truck("truck2", "red", "Diesel", "Concrete Mixer"));
        trucks.add(new Truck("truck3", "black", "Electric", "Dump truck"));
        return trucks;
    }
}
