package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer extends Machine implements MachineProducer {
    private static final int COUNT_TRUCKS = 3;

    @Override
    public List<? extends Machine> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < COUNT_TRUCKS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }

    @Override
    public void doWork() {

    }
}
