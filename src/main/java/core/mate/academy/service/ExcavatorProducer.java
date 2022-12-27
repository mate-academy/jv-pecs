package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorFirst = new Excavator();
        Excavator excavatorSecond = new Excavator();
        Excavator excavatorThird = new Excavator();
        return List.of(excavatorFirst, excavatorSecond, excavatorThird);
    }
}
