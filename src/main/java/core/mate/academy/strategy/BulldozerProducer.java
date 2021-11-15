package core.mate.academy.strategy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int COUNT_OF_MACHINES = 2;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
