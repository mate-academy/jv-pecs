package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator();
        excavatorOne.setDiggingDepth(50);
        excavatorOne.setColor("black");
        excavatorOne.setName("CAT");
        Excavator excavatorTwo = new Excavator();
        excavatorTwo.setDiggingDepth(70);
        excavatorTwo.setColor("grey");
        excavatorTwo.setName("Caterpillar");
        return List.of(excavatorOne,excavatorTwo);
    }
}
