package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator modelOne = new Excavator("JCBRIPPA 325M", 1500);
        Excavator modelTwo = new Excavator("JS130LC", 13625);
        Excavator modelTree = new Excavator("KUBOTA 325M", 1500);
        List<Excavator> list = List.of(modelOne, modelTwo, modelTree);
        return list;
    }
}
