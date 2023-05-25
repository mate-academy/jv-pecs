package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truck = new ArrayList<>();
        for (int i = 0; i < NUMBER_MACHINES; i++) {
            truck.add(new Truck());
        }
        return truck;
    }
}
