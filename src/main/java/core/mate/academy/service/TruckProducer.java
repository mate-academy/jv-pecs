package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private static final int TRUCK_COUNT = 3;
    private List<Truck> truck = new ArrayList<>();

    @Override
    public List<Truck> get() {
        for (int i = 0; i < TRUCK_COUNT; i++) {
            truck.add(new Truck());
        }
        return truck;
    }
}
