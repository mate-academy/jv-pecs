package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Excavator ExcavatorOne = new Excavator();
        ExcavatorOne.setDiggingDepth(50);
        ExcavatorOne.setColor("black");
        ExcavatorOne.setName("CAT");
        Excavator ExcavatorTwo = new Excavator();
        ExcavatorTwo.setDiggingDepth(70);
        ExcavatorTwo.setColor("grey");
        ExcavatorTwo.setName("Caterpillar");
        return List.of(ExcavatorOne,ExcavatorTwo);
    }
}
