package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProduser implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("excavator1");
        excavator1.setColor("blue");
        excavator1.bucketVolume(2.2);

        Excavator excavator2 = new Excavator();
        excavator2.setName("excavator2");
        excavator2.setColor("green");
        excavator2.bucketVolume(2);

        Excavator excavator3 = new Excavator();
        excavator3.setName("truck3");
        excavator3.setColor("gray");
        excavator3.bucketVolume(1.5);

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
