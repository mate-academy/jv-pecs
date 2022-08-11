package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        firstTruck.setFuelType("hybrid");
        secondTruck.setLength(12);
        List<Truck> trucks = new LinkedList<>();
        trucks.add(firstTruck);
        trucks.add(secondTruck);
        return trucks;
    }
}
