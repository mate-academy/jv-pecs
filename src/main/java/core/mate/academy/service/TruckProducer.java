package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> machines = new ArrayList<>();

    @Override
    public List<Truck> get() {
        createModels();
        return machines;
    }

    private void createModels() {
        machines.add(new Truck("Truck1", "Red"));
        machines.add(new Truck("Truck2", "Pink"));
        machines.add(new Truck("Truck3", "Olive"));
    }
}
