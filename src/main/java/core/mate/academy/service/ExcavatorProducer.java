package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(705.54));
        excavators.add(new Excavator(463.3));
        excavators.add(new Excavator(235.34));
        return excavators;
    }
}
