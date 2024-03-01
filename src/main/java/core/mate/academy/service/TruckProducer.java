package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_TRUCK = 5;

    @Override
    public List<Truck> get() {
        List<Truck> result = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_TRUCK; i++) {
            Truck truck = new Truck();
            truck.setWheels(i);
            result.add(truck);
        }
        return result;
    }
}
