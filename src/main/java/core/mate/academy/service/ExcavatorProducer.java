package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> produce() {

        Excavator e0 = new Excavator();
        e0.setId(0);
        e0.setBucketCapacity(2.5);

        Excavator e1 = new Excavator();
        e1.setId(1);
        e1.setBucketCapacity(3.5);

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(e0);
        excavators.add(e1);
        return excavators;
    }

}
