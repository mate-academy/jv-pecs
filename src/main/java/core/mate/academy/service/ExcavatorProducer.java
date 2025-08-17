package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int NUMBER_OF_EXCAVATOR = 5;
    private static final String BIGGER_THEN = "Bigger then ";

    @Override
    public List<Excavator> get() {
        List<Excavator> result = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_EXCAVATOR; i++) {
            Excavator excavator = new Excavator();
            excavator.setSize(BIGGER_THEN + i);
            result.add(excavator);
        }
        return result;
    }
}
