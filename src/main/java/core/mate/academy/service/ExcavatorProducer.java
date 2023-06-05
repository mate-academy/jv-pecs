package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(1990,"Electro"));
        excavators.add(new Excavator(2020,"Hybrid"));
        excavators.add(new Excavator(1975,"unknown"));
        return excavators;
    }
}
