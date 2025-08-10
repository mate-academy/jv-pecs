package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUMBER_OF_MODELS = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            Excavator excavator = new Excavator();
            excavator.setName("Excavator " + i);
            excavator.setColor("Orange");
            excavator.setBucketVolume((i + 1) * 2);
            excavators.add(excavator);
        }
        return excavators;
    }
}
