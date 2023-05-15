package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        final List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavator = new Excavator();
        excavator.setName("Excavator 1");
        excavator.setColor("Black-White");
        excavator.setMaxBucketVolume(12);
        excavator.setMaxHeightBucket(5);

        Excavator excavator2 = new Excavator();
        excavator2.setName("Excavator 2");
        excavator2.setColor("Brown");
        excavator2.setMaxBucketVolume(15);
        excavator2.setMaxHeightBucket(8);

        Excavator excavator3 = new Excavator();
        excavator3.setName("Excavator 3");
        excavator3.setColor("Lemon");
        excavator3.setMaxBucketVolume(18);
        excavator3.setMaxHeightBucket(10);

        excavatorList.add(excavator);
        excavatorList.add(excavator2);
        excavatorList.add(excavator3);

        return excavatorList;

    }
}
