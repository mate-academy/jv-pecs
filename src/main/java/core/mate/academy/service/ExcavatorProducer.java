package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final String[] excavatorNames = {"JCB", "Hyundai"};
    private final String[] excavatorColors = {"Black", "Blue"};

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < excavatorNames.length; i++) {
            Excavator excavator = new Excavator();
            excavator.setName(excavatorNames[i]);
            excavator.setColor(excavatorColors[i]);
            excavators.add(excavator);
        }
        return List.of(excavators.toArray(new Excavator[0]));
    }
}
