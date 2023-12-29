package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator dniproExcavator = new Excavator(5_000);
        Excavator kharkivExcavator = new Excavator(10_000);
        Excavator johnDeerExcavator = new Excavator(3_000);
        return List.of(dniproExcavator,
                kharkivExcavator, johnDeerExcavator);
    }
}
