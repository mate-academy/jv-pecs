package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> newList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Truck truck = new Truck();
            newList.add(truck);
        }
        return newList;
    }
}
