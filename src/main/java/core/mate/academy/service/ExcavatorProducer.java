package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Komatsu", 210));
        excavators.add(new Excavator("Hitachi", 180));
        excavators.add(new Excavator("Caterpillar", 350));
        return excavators;
    }
}
