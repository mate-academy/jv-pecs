package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final int productionBatchVolume = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> batch = new ArrayList<>();

        for (int i = 0; i < productionBatchVolume; i++) {
            batch.add(new Excavator());
        }

        return batch;
    }
}
