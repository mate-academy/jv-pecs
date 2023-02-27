package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl<M> implements MachineProducer<M> {
    @Override
    public List<M> get() {
        List<M> bulldozers = new ArrayList<>();
        for (int i = 0; i < MACHINE_QUANTITY; i++) {
            bulldozers.add((M) new Excavator());
        }
        return bulldozers;
    }
}
