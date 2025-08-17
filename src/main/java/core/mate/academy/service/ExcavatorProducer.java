package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private final Excavator excavator1 = new Excavator("Excavator1", "Yellow", 100);
    private final Excavator excavator2 = new Excavator("Excavator2", "Green", 150);
    private final Excavator excavator3 = new Excavator("Excavator3", "Grey", 200);
    private final List<Machine> excavators = List.of(excavator1, excavator2, excavator3);
    
    @Override
    public List<Machine> get() {
        return excavators;
    }
    
}
