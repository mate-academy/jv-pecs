package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Excavator> get() {
        Excavator modelOne = new Excavator();
        Excavator modelTwo = new Excavator();
        Excavator modelThree = new Excavator();
        List<Excavator> listOfModels = List.of(modelOne, modelTwo, modelThree);
        return listOfModels;
    }
}
