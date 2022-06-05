package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckRenault = new Truck("Renault", "Red", 10,20);
        Truck truckMercedes = new Truck("Mercedes", "Black", 10, 21);
        List<Truck> trucks = new LinkedList<>();
        trucks.add(truckRenault);
        trucks.add(truckMercedes);
        return trucks;
    }
}
