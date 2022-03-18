package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator("excavator x1", "blue", 10);
        Excavator excavatorSecond = new Excavator("excavator x2", "orange", 12);
        Excavator excavatorThird = new Excavator("excavator x3", "brown", 15);
        return List.of(excavatorOne, excavatorSecond, excavatorThird);
    }
}
