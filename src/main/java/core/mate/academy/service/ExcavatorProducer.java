package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("JCB", "Yellow", 2.0);
    private Excavator excavator2 = new Excavator("Hitachi", "White", 1.9);
    private Excavator excavator3 = new Excavator("Doosan", "Red", 1.85);

    @Override
    public List<Excavator> get() {
        return List.of(excavator1, excavator2, excavator3);
    }
}
