package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator>{
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Volvo", 2008, "used", "diesel");
        Excavator excavator2 = new Excavator("Atlas", 1998, "used", "diesel");
        Excavator excavator3 = new Excavator("Doosan", 2011, "used", "diesel");
        return List.of(excavator1, excavator2, excavator3);
    }
}
