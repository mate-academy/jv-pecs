package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorFirst = new Excavator("excavatorFirst", "yellow", "Floating");
        Excavator excavatorSecond = new Excavator("excavatorSecond", "green", "Rails");
        Excavator excavatorThird = new Excavator("excavatorThird", "blue", "Crawler");
        return List.of(excavatorFirst, excavatorSecond, excavatorThird);
    }
}
