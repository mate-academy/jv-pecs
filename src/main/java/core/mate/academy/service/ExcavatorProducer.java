package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("excav1", "yellow", "S"));
        excavators.add(new Excavator("excav2", "green", "M"));
        excavators.add(new Excavator("excav3", "blue", "L"));
        return excavators;
    }
}
