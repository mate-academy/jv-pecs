package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Truck_one", "white", 1));
        list.add(new Truck("Truck_two", "black", 2));
        list.add(new Truck("Truck_three", "gold", 3));
        return list;
    }
}
