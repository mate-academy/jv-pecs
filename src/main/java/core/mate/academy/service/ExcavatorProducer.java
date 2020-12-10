package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavator1 = new Excavator("Robocop", "Grey", false);
        excavators.add(excavator1);
        excavators.add(excavator1);
        return excavators;
    }
}
