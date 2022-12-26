package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    private Excavator excavator1 = new Excavator(1, 2);
    private Excavator excavator2 = new Excavator(2, 3);
    private Excavator excavator3 = new Excavator(3, 4);

    private List<Excavator> excavators = List.of(excavator1, excavator2, excavator3);

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
