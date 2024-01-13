package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Ford E-350", "Red", 3));
        list.add(new Truck("Dodge Ram 4500", "Black", 4));
        list.add(new Truck("Freightliner M2", "White", 5));
        return list;
    }
}
