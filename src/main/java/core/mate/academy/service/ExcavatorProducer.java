package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Collections.addAll(excavators,
                new Excavator("Viking", "Black", 2, 6),
                new Excavator("Thunder", "Yellow", 2, 7),
                new Excavator("Atlas", "Blue", 3, 6));
        return excavators;
    }
}
