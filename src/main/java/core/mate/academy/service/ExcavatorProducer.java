package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int AMOUNT_OF_EXCAVATORS = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_EXCAVATORS; i++) {
            excavatorList.add(new Excavator());
        }
        return excavatorList;
    }
}
