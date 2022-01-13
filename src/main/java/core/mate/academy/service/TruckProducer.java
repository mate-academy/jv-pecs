package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Freightliner-M2", "white", 300, "Boston"));
        list.add(new Truck("Freightliner-M1", "blue", 200, "New York"));
        list.add(new Truck("Freightliner-M3", "black", 500, "LA"));
        return list;
    }
}
