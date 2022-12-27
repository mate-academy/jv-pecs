package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorFirst = new Excavator(5.25, 2.7, "crawler");
        Excavator excavatorSecond = new Excavator(4.90, 1.6, "wheel");
        Excavator excavatorThird = new Excavator(5.47, 4.3, "crawler");
        return List.of(excavatorFirst, excavatorSecond, excavatorThird);
    }
}
