package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator newExcavator = new Excavator("CAT", "NewLadle-3000");
        Excavator previousExcavator = new Excavator("KOMATSU","OldLadle-400");
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(newExcavator);
        excavators.add(previousExcavator);
        return excavators;
    }
}
