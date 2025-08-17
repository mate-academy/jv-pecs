package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();

        int randomSize = new Random().nextInt(20);
        for (int i = 0; i < randomSize; i++) {
            Excavator excavator = new Excavator();
            excavator.setBucketVolume(850);
            excavator.setName("Excava" + i);
            excavator.setBoomLength(1000);
            list.add(excavator);
        }
        return list;
    }
}
