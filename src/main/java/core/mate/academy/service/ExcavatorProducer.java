package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("CAT 320", 2017, 1.19));
        excavators.add(new Excavator("Volvo EC220", 2019, 1.3));
        excavators.add(new Excavator("Hitachi ZX250", 2021, 1.4));
        return excavators;
    }
}
