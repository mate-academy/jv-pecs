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
                new Excavator("Excavator1", "yellow", 1.2, 1.2, 6.6, 9.7),
                new Excavator("Excavator2", "white", 1.1, 0.8, 5.5, 3.3),
                new Excavator("Excavator3", "green", 0.8, 0.6, 4.2, 3.0)
        );
        return excavators;
    }
}
