package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> newList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Excavator newExcavator = new Excavator();
            newExcavator.setMaxReach(14);
            newExcavator.setMaxDiggingDepth(11);
            newExcavator.setColor("yellow");
            newExcavator.setName("Super Excavator");
            newList.add(newExcavator);
        }
        return newList;
    }
}
