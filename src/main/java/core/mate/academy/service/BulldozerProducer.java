package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final int productionBatchVolume = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> batch = new ArrayList<>();

        for (int i = 0; i < productionBatchVolume; i++) {
            batch.add(new Bulldozer());
        }

        return batch;
    }
}
