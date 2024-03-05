package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("International company", 10);
        Excavator excavator2 = new Excavator("Local company", 4);
        Excavator excavator3 = new Excavator("Some company", 8);
        return List.of(excavator1, excavator2, excavator3);
    }
}
