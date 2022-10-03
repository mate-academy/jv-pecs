package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    List<Truck> truckList;
    @Override
    public List<Truck> get() {
        return truckList;
    }
}
