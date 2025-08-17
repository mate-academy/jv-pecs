package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("EX1", "red", 10, 10);
        Excavator secondExcavator = new Excavator("EX2", "green", 20, 20);
        Excavator thirdExcavator = new Excavator("EX3", "blue", 30, 30);
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
