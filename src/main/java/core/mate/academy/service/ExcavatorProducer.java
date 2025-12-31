package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        excavator.setYear(2011);
        excavator.setName("Ex");
        excavator.setColor("Yellow");

        Excavator excavator1 = new Excavator();
        excavator1.setYear(2007);
        excavator1.setColor("Green");
        excavator1.setName("SLM");

        return List.of(excavator, excavator1);
    }
}
