package core.mate.academy.service.machineproducerimpl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_TRUCK_QUANTITY = 5;

    @Override
    public List<Truck> get() {
        List<Truck> trucksPark = new ArrayList<>();
        for (int i = 0; i < MAX_TRUCK_QUANTITY; i++) {
            trucksPark.add(new Truck());
        }
        return trucksPark;
    }
}
