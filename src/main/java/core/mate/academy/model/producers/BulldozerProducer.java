package core.mate.academy.model.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int OBJECT_COUNT = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < OBJECT_COUNT; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
