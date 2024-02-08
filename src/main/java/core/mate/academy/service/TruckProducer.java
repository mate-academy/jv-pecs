package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    List<Truck> list = new ArrayList<>();
    Truck truck = new Truck();
    @Override
    public List<Truck> get() {
        list.add(truck);
        return list;
    }
}