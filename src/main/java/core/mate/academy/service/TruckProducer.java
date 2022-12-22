package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> elements = new ArrayList<>();

    @Override
    public List<Truck> get() {
        createModels();
        return elements;
    }

    private void createModels() {
        elements.add(new Truck("Truck1", "Red"));
        elements.add(new Truck("Truck2", "Pink"));
        elements.add(new Truck("Truck3", "Olive"));
    }
}
