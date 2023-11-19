package core.mate.academy.model.producers;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < OBJECT_COUNT; i++) {
            trucks.add(new Truck("MAN", "black", 5600, true));
        }
        return trucks;
    }
}
