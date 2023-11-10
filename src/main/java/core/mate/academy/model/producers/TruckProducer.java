package core.mate.academy.model.producers;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int OBJECT_COUNT = 3;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < OBJECT_COUNT; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
