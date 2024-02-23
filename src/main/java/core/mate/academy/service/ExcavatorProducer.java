package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setDiggingDepth(2);
        firstExcavator.setExcavationType("rock excavation");
        Excavator secondExcavator = new Excavator();
        secondExcavator.setDiggingDepth(3);
        secondExcavator.setExcavationType("slope excavation");
        Excavator thirdExcavator = new Excavator();
        thirdExcavator.setDiggingDepth(4);
        thirdExcavator.setExcavationType("basement excavation");
        return List.of(firstExcavator,secondExcavator,thirdExcavator);
    }
}
