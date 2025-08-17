package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Evergreen",1000));
        trucks.add(new Truck("Proper_Shipping", 1200));
        trucks.add(new Truck("Chemical",1300));
        return trucks;
    }
}
