package core.mate.academy.specificimp;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_TRUCKS = 10;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_TRUCKS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
