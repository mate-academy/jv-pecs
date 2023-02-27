package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl<M> implements MachineProducer<M> {
    @Override
    public List<M> get() {
        List<M> bulldozers = new ArrayList<>();
        for (int i = 0; i < MACHINE_QUANTITY; i++) {
            bulldozers.add((M) new Bulldozer());
        }
        return bulldozers;
    }
}
