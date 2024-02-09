package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    Truck truck = new Truck();
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(truck);
        return list;
    }
}
