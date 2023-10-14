package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final int productionBatchVolume = 3;

    @Override
    public List<Truck> get() {
        List<Truck> batch = new ArrayList<>();

        for (int i = 0; i < productionBatchVolume; i++) {
            batch.add(new Truck());
        }

        return batch;
    }
}
