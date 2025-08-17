package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();

        excavator1.setName("Excavator1");
        excavator2.setName("Excavator2");
        excavator3.setName("Excavator3");

        excavator1.setColor("Black");
        excavator2.setColor("Yellow");
        excavator3.setColor("White");

        excavator1.setArrowLength(5);
        excavator2.setArrowLength(6);
        excavator3.setArrowLength(7);

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
