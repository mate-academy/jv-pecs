package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("MyLovelyExcavator1", "red", 100, true));
        excavators.add(new Excavator("MyLovelyExcavator2", "orange", 50, true));
        excavators.add(new Excavator("MyLovelyExcavator3", "yellow", 700, false));
        return excavators;
    }
}
