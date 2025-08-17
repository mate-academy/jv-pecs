package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int EXCAVATOR_NUMBER = 3;
    private List<Excavator> excavatorList;

    public ExcavatorProducer() {
        excavatorList = new ArrayList<>();
    }

    @Override
    public List<Excavator> get() {
        for (int i = 0; i < EXCAVATOR_NUMBER; i++) {
            Excavator excavator = new Excavator();
            excavatorList.add(i,excavator);
        }
        return excavatorList;
    }
}
