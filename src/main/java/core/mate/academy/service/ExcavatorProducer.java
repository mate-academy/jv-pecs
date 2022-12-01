package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator();
        Excavator excavatorTwo =
                new Excavator("electric", "track", "build");
        Excavator excavatorThree = new Excavator();
        return List.of(excavatorOne, excavatorTwo, excavatorThree);
    }
}
