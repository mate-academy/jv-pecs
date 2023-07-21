package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Truck> get() {
        List<Truck> consignment = new ArrayList<>();
        for (int i = PRODUCTION_AMOUNT; i > 0; i--) {
            consignment.add(new Truck());
        }
        return consignment;
    }
}
