package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Excavator1","Black",50, 250);
        Excavator excavator2 = new Excavator("Excavator2","White",78, 500);
        Excavator excavator3 = new Excavator("Excavator3","Green",100, 750);
        return Arrays.asList(excavator1, excavator2, excavator3);
    }
}
