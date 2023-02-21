package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducerImpl<M> implements MachineProducer<M> {
    @Override
    public List<M> get() {
        M excavator1 = (M) new Excavator();
        M excavator2 = (M) new Excavator();
        M excavator3 = (M) new Excavator();
        return List.of(excavator1, excavator2, excavator3);
    }
}
