package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator firstExcavator = new Excavator();
        firstExcavator.setLaddleVolume(100);
        Excavator secondExcavator = new Excavator();
        secondExcavator.setLaddleVolume(150);
        excavators.add(firstExcavator);
        excavators.add(secondExcavator);
        return excavators;
    }
}
