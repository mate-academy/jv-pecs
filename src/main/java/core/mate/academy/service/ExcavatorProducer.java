package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Hitachi", "orange",
                "straight", 6.2, 1.8));
        excavators.add(new Excavator("Volvo", "gray",
                "rotation", 7.0, 2.3));
        return excavators;
    }
}
