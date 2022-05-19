package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {

    private Excavator firstExcavator = new Excavator("Construct", "Red", 2, true);
    private Excavator secondExcavator = new Excavator("Second construct", "Orange", 4, false);
    private Excavator thirdExcavator = new Excavator("Electrification", "Green", 3, false);

    @Override
    public List<Machine> get() {
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
