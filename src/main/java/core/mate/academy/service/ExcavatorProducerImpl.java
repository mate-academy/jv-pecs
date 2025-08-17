package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private Excavator[] models = {
            new Excavator(2, 4),
            new Excavator(4, 6),
            new Excavator(6, 8)
    };

    @Override
    public List<Excavator> get() {
        return Arrays.asList(models);
    }
}
