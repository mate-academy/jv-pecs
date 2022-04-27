package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(true, 0.57, 1);
        excavator1.setName("Excavator1");
        excavator1.setColor("White");
        Excavator excavator2 = new Excavator(false, 0.23, 5);
        excavator2.setName("Excavator2");
        excavator2.setColor("Orange");
        return List.of(excavator1, excavator2);
    }
}
