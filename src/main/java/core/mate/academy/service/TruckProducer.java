package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("First", "White"));
        list.add(new Truck("Second", "Black"));
        list.add(new Truck("Third", "Red"));
        return list;
    }
}
