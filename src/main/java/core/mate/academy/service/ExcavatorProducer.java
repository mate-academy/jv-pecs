package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("volvo", 2020));
        excavators.add(new Excavator("man", 1992));
        excavators.add(new Excavator("scania", 2010));
        return excavators;
    }
}
