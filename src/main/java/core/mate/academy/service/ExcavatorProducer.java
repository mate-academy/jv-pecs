package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        final List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavatorFirst = new Excavator();
        excavatorFirst.setName("Excavator 1");
        excavatorFirst.setColor("Black-White");
        excavatorFirst.setMaxBucketVolume(12);
        excavatorFirst.setMaxHeightBucket(5);

        Excavator excavatorSecond = new Excavator();
        excavatorSecond.setName("Excavator 2");
        excavatorSecond.setColor("Brown");
        excavatorSecond.setMaxBucketVolume(15);
        excavatorSecond.setMaxHeightBucket(8);

        Excavator excavatorThird = new Excavator();
        excavatorThird.setName("Excavator 3");
        excavatorThird.setColor("Lemon");
        excavatorThird.setMaxBucketVolume(18);
        excavatorThird.setMaxHeightBucket(10);

        excavatorList.add(excavatorFirst);
        excavatorList.add(excavatorSecond);
        excavatorList.add(excavatorThird);

        return excavatorList;

    }
}
