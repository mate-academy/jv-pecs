package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = List.of(
                new Excavator("excavator 1", "blue", 5),
                new Excavator("excavator 2", "pink", 17));
        return excavators;
    }
}
