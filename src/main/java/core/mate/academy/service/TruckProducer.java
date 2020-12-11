package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final Truck FIRST = new Truck();
    private static final Truck SECOND = new Truck();
    private static final Truck THIRD = new Truck();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(FIRST);
        trucks.add(SECOND);
        trucks.add(THIRD);
        return trucks;
    }
}
