package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck_One", "black", "SuperCargo"));
        trucks.add(new Truck("Truck_Two", "blue", "Standard"));
        trucks.add(new Truck("Truck_Three", "green", "Wagon"));
        return trucks;
    }
}
