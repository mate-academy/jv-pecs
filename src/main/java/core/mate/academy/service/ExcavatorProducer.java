package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private static final int NUMBER_OF_MODELS = 3;
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            excavatorList.add(new Excavator());
        }
        return excavatorList;
    }
}
