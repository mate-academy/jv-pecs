package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavator = new Excavator();
        excavator.setEngineVolume((0.5 + (6.0 - 0.5) * new Random().nextDouble()));
        excavator.setYear(1960 + (int) (Math.random() * 2022));
        excavators.add(excavator);
        excavators.add(excavator);
        excavators.add(excavator);
        return excavators;
    }
}
