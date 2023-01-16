package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Excavator excavator1 = new Excavator(15,"Wide");
        Excavator excavator2 = new Excavator(7,"Short");
        Excavator excavator3 = new Excavator(21,"Biggest");
        return List.of(excavator1,excavator2,excavator3);
    }
}
