package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("MAN", 555);
        Excavator secondExcavator = new Excavator("JCB", 652);
        return List.of(firstExcavator, secondExcavator);
    }
}
