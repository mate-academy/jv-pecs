package core.mate.academy.strategy;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int COUNT_OF_MACHINES = 2;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
