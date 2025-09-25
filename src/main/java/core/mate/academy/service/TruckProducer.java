package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int NUMBER_OF_MODELS = 5;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            Truck truck = new Truck();
            truck.setName("Truck nr " + i);
            truck.setColor("Pink");
            truck.setRange((i + 5) * 100);
            trucks.add(truck);
        }
        return trucks;
    }
}
