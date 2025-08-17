package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Hitachi ZX200", "помаранчевий", 500));
        excavators.add(new Excavator("Caterpillar 320", "жовтий", 750));
        return excavators;
    }
}
