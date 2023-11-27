package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerExcavator implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("JCB JS160W", "black", 32));
        excavators.add(new Excavator("Caterpillar 320C", "black", 40));
        excavators.add(new Excavator("Liebherr A920 Litronic", "green", 28));
        return excavators;
    }
}
