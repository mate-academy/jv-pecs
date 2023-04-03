package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator modelOne = new Excavator();
        Excavator modelTwo = new Excavator();
        Excavator modelTree = new Excavator();
        List<Excavator> list = List.of(modelOne, modelTwo, modelTree);
        return list;
    }
}
