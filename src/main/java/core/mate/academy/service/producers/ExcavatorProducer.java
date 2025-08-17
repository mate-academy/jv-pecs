package core.mate.academy.service.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> excavators = new ArrayList<>();
        excavators.add(new Excavator("Caterpillar", "Yellow", 900));
        excavators.add(new Excavator("Komatsu", "Grey", 1100));
        excavators.add(new Excavator("Hitachi ", "Orange", 800));
        return excavators;
    }
}
