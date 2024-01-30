package core.mate.academy.service;

import core.mate.academy.data.Excavators;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        Excavators[] excavatorsNames = Excavators.values();
        List<Excavator> excavatorList = new ArrayList<>();

        for (int i = 0; i < NUMBERS_OF_MODELS; i++) {
            String color = Machine.getRandomColor();
            String name = excavatorsNames[i].toString();
            excavator.of(name, color);
            excavatorList.add(excavator);
        }
        return excavatorList;
    }
}
