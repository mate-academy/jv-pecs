package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("Black","Excavator1"),
            new Excavator("White","Excavator2"),
            new Excavator("Red","Excavator3"));
    }
}
