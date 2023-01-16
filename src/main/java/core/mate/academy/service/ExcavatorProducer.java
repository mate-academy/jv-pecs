package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(15,"Wide");
        Excavator excavator2 = new Excavator(7,"Short");
        Excavator excavator3 = new Excavator(21,"Biggest");
        return List.of(excavator1,excavator2,excavator3);
    }
}
