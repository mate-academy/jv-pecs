package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Excavator firstExcavator = new Excavator(15,"Wide");
        Excavator secondExcavator = new Excavator(7,"Short");
        Excavator thirdExcavator = new Excavator(21,"Biggest");
        return List.of(firstExcavator,secondExcavator,thirdExcavator);
    }
}
