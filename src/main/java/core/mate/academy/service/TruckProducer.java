package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MACHINE_NUMBER = 3;

    public List<Truck> get() {
        Truck truck = new Truck();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        List<Truck> list = new ArrayList<>();
        list.add(truck);
        list.add(truck1);
        list.add(truck2);
        return list;
    }
}
