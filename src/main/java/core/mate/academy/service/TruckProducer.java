package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list = new ArrayList<>();

    public TruckProducer() {
        list.add(new Truck("Freightliner"));
        list.add(new Truck("Kenworth"));
        list.add(new Truck("Volvo"));
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
