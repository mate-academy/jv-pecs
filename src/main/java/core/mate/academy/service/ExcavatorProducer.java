package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Volvo", 110));
        excavators.add(new Excavator("Doosan", 210));
        excavators.add(new Excavator("JCB", 310));
        excavators.add(new Excavator("Liebherr Group", 410));
        excavators.add(new Excavator("Hitachi", 510));
        return excavators;
    }
}
