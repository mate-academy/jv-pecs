package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Case IH", 11500, "diesel"));
        excavators.add(new Excavator("JCB", 8907, "diesel"));
        excavators.add(new Excavator("Hidromek", 169, "diesel"));
        return excavators;
    }
}
