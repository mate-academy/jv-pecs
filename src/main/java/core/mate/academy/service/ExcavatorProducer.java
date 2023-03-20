package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator(34.4, 34.5, 28.7);
    private Excavator excavator2 = new Excavator(36.6, 32.2, 29.3);
    private Excavator excavator3 = new Excavator(35.8, 36.5, 31.2);

    private List<Excavator> excavators = List.of(excavator1,excavator2,excavator3);

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
