package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private static final int BATCH_SIZE = 3;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        ColorManager colorManager = new ColorManager();
        for (int i = 1; i <= BATCH_SIZE; i++) {
            Truck truck = new Truck();
            truck.setName("Truck #" + i);
            truck.setColor(colorManager.getRandomColor());
            trucks.add(truck);
        }
        return trucks;
    }
}
