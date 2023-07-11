package core.mate.academy.implementation;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_CAR = 3;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CAR; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
