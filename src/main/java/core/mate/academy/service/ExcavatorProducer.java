package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    public ExcavatorProducer() {
        excavators.add(new Excavator("firstExcavator", "yellow"));
        excavators.add(new Excavator("secondExcavator", "pink"));
        excavators.add(new Excavator("thirdExcavator", "white"));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
