package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("Caterpillar");
        excavator1.setColor("Yellow");
        excavator1.setBucketVolume(2.0);
        List<Excavator> list = new ArrayList<>();
        list.add(excavator1);
        Excavator excavator2 = new Excavator();
        excavator2.setName("Caterpillar");
        excavator2.setColor("Yellow");
        excavator2.setBucketVolume(2.5);
        list.add(excavator2);
        return list;
    }
}
