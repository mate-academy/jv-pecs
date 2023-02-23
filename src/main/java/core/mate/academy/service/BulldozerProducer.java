package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer extends Machine implements MachineProducer {
    private static final int COUNT_BULLDOZERS = 3;

    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < COUNT_BULLDOZERS; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }

    @Override
    public void doWork() {

    }
}
