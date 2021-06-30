package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("Piotr");
        excavator1.setColor("white");
        excavator1.setMaxWorkDepth(23);
        excavator1.setShovelSize(718);

        Excavator excavator2 = new Excavator();
        excavator2.setName("Pavel");
        excavator2.setColor("green");
        excavator2.setMaxWorkDepth(12);
        excavator2.setShovelSize(665);

        return new ArrayList<>(Arrays.asList(excavator1, excavator2));
    }
}
