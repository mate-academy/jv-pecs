package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(1500,"Renault"));
        excavators.add(new Excavator(1600,"MAN"));
        excavators.add(new Excavator(1700,"Scania"));
        return excavators;
    }
}
