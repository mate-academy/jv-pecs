package core.mate.academy.service;

import core.mate.academy.interfaces.MachineProducer;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck1", "green",65, 145));
        trucks.add(new Truck("Truck2", "black",40, 122));
        trucks.add(new Truck("Truck3", "red",70, 188));
        return trucks;
    }
}
