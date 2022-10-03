package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
        truckList.add(new Truck(15d));
    }


    @Override
    public List<Truck> get() {
        return truckList;
    }
}
