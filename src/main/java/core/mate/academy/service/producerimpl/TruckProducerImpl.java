package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private static final int DEFAULT_TRUCK_NUMBER = 10;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < DEFAULT_TRUCK_NUMBER; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
