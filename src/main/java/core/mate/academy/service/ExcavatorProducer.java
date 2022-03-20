package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Excavator1", "orange", 2002);
        Excavator excavator2 = new Excavator("Excavator2", "grey", 2005);
        Excavator excavator3 = new Excavator("Excavator3", "yellow", 2010);
        return List.of(excavator1, excavator2, excavator3);
    }
}
