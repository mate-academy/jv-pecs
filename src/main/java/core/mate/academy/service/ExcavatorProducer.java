package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<Excavator>();
        excavators.add(new Excavator("Caterpillar", 15, 400));
        excavators.add(new Excavator("Komatsu", 12, 350));
        excavators.add(new Excavator("Hitachi", 18, 420));
        return excavators;
    }
}
