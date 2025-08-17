package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckDaf = new Truck("DAF", "Red", 24,14);
        Truck truckRenault = new Truck("Renault", "White", 10, 8);
        Truck truckMercedes = new Truck("Mercedes", "Blue", 5,4);
        List<Truck> trucks = new LinkedList<>();
        trucks.add(truckDaf);
        trucks.add(truckRenault);
        trucks.add(truckMercedes);
        return trucks;
    }
}
