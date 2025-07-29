package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        final List<Excavator> excavators = new ArrayList<>();

        Excavator e1 = new Excavator();
        e1.setName("Hitachi ZX200");
        e1.setColor("Red");
        e1.setArmLength(10);
        excavators.add(e1);

        Excavator e2 = new Excavator();
        e2.setName("Volvo EC750E");
        e2.setColor("Blue");
        e2.setArmLength(15);
        excavators.add(e2);

        return excavators;
    }
}
