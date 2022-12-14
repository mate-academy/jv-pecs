package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavatorCat = new Excavator();
        Excavator excavatorJbc = new Excavator();
        Excavator excavatorBroken = new Excavator();
        return List.of(excavatorCat, excavatorJbc, excavatorBroken);
    }
}
