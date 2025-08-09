package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_MODELS = 3;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            Truck truck = new Truck();
            truck.setName("Truck " + i);
            truck.setColor("Orange");
            truck.setWheels((i + 2) * 2);
            truck.setLoadCapacity((i + 1) * 1000);
            trucks.add(truck);
        }
        return trucks;
    }
}
