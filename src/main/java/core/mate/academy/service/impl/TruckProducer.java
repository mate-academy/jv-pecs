package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;

import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new java.util.ArrayList<>(List.of());
        list.add(new Truck(18, 30_000));
        list.add(new Truck(6, 10_000));
        return list;
    }
}
