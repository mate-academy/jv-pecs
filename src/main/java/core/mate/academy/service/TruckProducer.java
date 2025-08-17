package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Man", "Red", 1000, 25));
        list.add(new Truck("Man", "Black", 1200, 20));
        list.add(new Truck("Reno", "White", 1200, 30));
        list.add(new Truck("Volvo", "Silver", 1100, 25));
        return list;
    }
}
