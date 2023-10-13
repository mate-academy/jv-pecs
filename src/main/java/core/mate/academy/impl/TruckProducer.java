package core.mate.academy.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int AMOUNT_OF_MACHINE_TO_CREATE = 3;
    private static final String TRUCK_BODY_TYPE = "Concrete mixer";
    private static final String TRUCK_CARGO_TYPE = "Concrete";
    private static final double TRUCK_PAYLOAD = 5.5;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_MACHINE_TO_CREATE; i++) {
            trucks.add(getDefaultTruck());
        }
        return trucks;
    }

    private Truck getDefaultTruck() {
        return new Truck(TRUCK_BODY_TYPE,
                TRUCK_CARGO_TYPE,
                TRUCK_PAYLOAD);
    }
}
