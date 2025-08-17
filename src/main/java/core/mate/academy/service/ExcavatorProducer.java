package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MAX_CAB_CAPACITY = 3;

    @Override
    public List<Excavator> get() {
        Random randomCapacity = new Random();
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < MODELS_AMOUNT; i++) {
            excavatorList.add(new Excavator(randomCapacity.nextInt(MAX_CAB_CAPACITY)));
        }
        return excavatorList;
    }
}
