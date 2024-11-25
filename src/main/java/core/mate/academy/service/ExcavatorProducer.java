package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Miragge", "white", 12.4));
        excavators.add(new Excavator("Butter", "blue", 15.2));
        excavators.add(new Excavator("CAT", "yellow", 16.0));
        return excavators;
    }
}
