package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setColor("White");
        excavator1.setName("Brown");
        excavator1.setBucketVolume(25);
        Excavator excavator2 = new Excavator();
        excavator2.setColor("Black");
        excavator2.setName("Bobby");
        excavator2.setBucketVolume(25);
        Excavator excavator3 = new Excavator();
        excavator3.setColor("Red");
        excavator3.setName("Jack");
        excavator3.setBucketVolume(25);

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
