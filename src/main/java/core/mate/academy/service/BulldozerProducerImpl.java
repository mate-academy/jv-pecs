package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private static final int DEFAULT_HORSE_POWERS = 700;
    private static final String DEFAULT_TYPE = "caterpillar";

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < MACHINES_QUANTITY; i++) {
            bulldozers.add(new Bulldozer(DEFAULT_HORSE_POWERS, DEFAULT_TYPE));
        }
        return bulldozers;
    }
}
