package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Tanker", 37854.1,"Diesel", 20.2));
        trucks.add(new Truck("Flatbed", 44.5, "Diesel", 17.4));
        trucks.add(new Truck("CarHauler", 3, "Diesel", 12.5));
        return trucks;
    }
}
