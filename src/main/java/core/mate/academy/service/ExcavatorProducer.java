package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<T extends Excavator> implements MachineProducer{
    private List<Excavator> list = new ArrayList<>();
    @Override
    public List<T> get() {
        Excavator excavatorBig = new Excavator();
        excavatorBig.setName("CAT 336");
        excavatorBig.setBucketCapacity(6.5);
        excavatorBig.setColor("yellow");
        list.add(excavatorBig);
        Excavator excavatorMiddle = new Excavator();
        excavatorMiddle.setName("CAT 374");
        excavatorMiddle.setBucketCapacity(3.8);
        excavatorMiddle.setColor("black");
        list.add(excavatorMiddle);
        Excavator excavatorSmall = new Excavator();
        excavatorSmall.setName("CAT 326 SLR");
        excavatorSmall.setBucketCapacity(0.5);
        excavatorSmall.setColor("green");
        list.add(excavatorSmall);
        return (List<T>) list;
    }
}
