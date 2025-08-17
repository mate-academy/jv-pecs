package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();

        excavator1.setName("excavator1");
        excavator2.setName("excavator2");
        excavator3.setName("excavator3");

        excavator1.setColor("Pink");
        excavator2.setColor("Black");
        excavator3.setColor("Green");

        excavator1.setArrowLength(4);
        excavator2.setArrowLength(5);
        excavator3.setArrowLength(6);

        List<Excavator> excavators;
        excavators = List.of(excavator1, excavator2, excavator3);
        return excavators;
    }
}
