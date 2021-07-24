package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    private List<Truck> list;

    public TruckProducer() {
        list = new ArrayList<>();
        list.add(new Truck());
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
