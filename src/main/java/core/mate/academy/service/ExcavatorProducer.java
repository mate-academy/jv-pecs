package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int BATCH_SIZE = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        ColorManager colorManager = new ColorManager();
        for (int i = 1; i <= BATCH_SIZE; i++) {
            Excavator excavator = new Excavator();
            excavator.setName("Excavator #" + i);
            excavator.setColor(colorManager.getRandomColor());
            excavators.add(excavator);
        }
        return excavators;
    }
}
