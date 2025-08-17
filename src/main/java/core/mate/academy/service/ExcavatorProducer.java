package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("wheeled", 3000, 4000);
    private Excavator excavator2 = new Excavator("wheeled", 5000, 5000);
    private Excavator excavator3 = new Excavator("tracked", 5000, 6000);

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = Arrays.asList(excavator1, excavator2, excavator3);
        return excavators;
    }
}
