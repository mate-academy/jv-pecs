package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final Excavator firstExcavator = new Excavator();
    private static final Excavator secondExcavator = new Excavator();
    private static final Excavator thirdExcavator = new Excavator();

    @Override
    public List<Excavator> get() {
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
