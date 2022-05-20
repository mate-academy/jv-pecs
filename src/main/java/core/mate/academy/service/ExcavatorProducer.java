package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    private Excavator firstExcavator = new Excavator("Construct", "Red", 2, true);
    private Excavator secondExcavator = new Excavator("Second construct", "Orange", 4, false);
    private Excavator thirdExcavator = new Excavator("Electrification", "Green", 3, false);

    @Override
    public List get() {
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
