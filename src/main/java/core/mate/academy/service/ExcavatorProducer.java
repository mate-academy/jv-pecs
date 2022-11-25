package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("excavator1", "Yelow", 60));
        excavators.add(new Excavator("excavator2", "BLUE", 45));
        return excavators;
    }
}
