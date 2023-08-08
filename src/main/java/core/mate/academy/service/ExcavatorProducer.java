package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int COUNT_EXCAVATOR = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> listExcavator = new ArrayList<>();
        for (int i = 0; i < COUNT_EXCAVATOR; i++) {
            listExcavator.add(new Excavator());
        }
        return listExcavator;
    }
}
