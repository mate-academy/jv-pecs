package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> machines = new ArrayList<>();
        Truck truck = new Truck();
        truck.setName("Big Truck");
        truck.setColor("Yellow");
        machines.add(truck);
        truck = new Truck();
        truck.setName("Small Truck");
        truck.setColor("Brown");
        machines.add(truck);
        return machines;
    }
}
