package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> resultBulldozer = new ArrayList<>();
        resultBulldozer.add(new Truck("Red", 344, "Dump Truck"));
        resultBulldozer.add(new Truck("Yellow", 311, "Flatbed Truck"));
        resultBulldozer.add(new Truck("White", 410, "Van"));
        return resultBulldozer;
    }
}
