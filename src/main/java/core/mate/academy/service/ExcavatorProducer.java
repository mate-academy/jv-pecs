package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private Excavator excavator1 = new Excavator();
    private Excavator excavator2 = new Excavator();
    private Excavator excavator3 = new Excavator();
    private List<Excavator> excavators = List.of(excavator1, excavator2, excavator3);

    @Override
    public List<? extends Machine> get() {
        return excavators;
    }
}
