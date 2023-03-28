package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator bigExcavator = new Excavator(20, 30);
        Excavator meidumExcavator = new Excavator(15, 40);
        Excavator smallExcavator = new Excavator(5, 60);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(bigExcavator);
        excavators.add(meidumExcavator);
        excavators.add(smallExcavator);
        return excavators;
    }
}
