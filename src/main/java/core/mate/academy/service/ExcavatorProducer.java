package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list;

    @Override
    public List<Excavator> get() {
        createList();
        return list;
    }

    private void createList() {
        list = new ArrayList<>();
        Excavator excavator1 = new Excavator();
        excavator1.setExcavatorBucketVolume(20);
        excavator1.setName("excavator1");
        excavator1.setColor("black");
        list.add(excavator1);
        Excavator excavator2 = new Excavator();
        excavator2.setExcavatorBucketVolume(20);
        excavator2.setName("excavator2");
        excavator2.setColor("yellow");
        list.add(excavator2);
    }
}
