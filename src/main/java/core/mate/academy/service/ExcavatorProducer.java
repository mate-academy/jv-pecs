package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    public static final int EXCAVATOR_NUMBER = 3;
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < EXCAVATOR_NUMBER; i++) {
            excavatorList.add(new Excavator());
        }
        return excavatorList;
    }
}
