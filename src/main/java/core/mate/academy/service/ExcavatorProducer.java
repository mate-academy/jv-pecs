package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        List<Machine> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator First", "White", 100, 150));
        excavators.add(new Excavator("Excavator Second", "Yellow", 150, 250));
        excavators.add(new Excavator("Excavator Third", "Blue", 130, 350));
        return excavators;
    }
}
