package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavator1 = new Excavator(40);
        excavator1.setName("Excavator#1");
        excavator1.setColor("white");
        excavatorList.add(excavator1);
        Excavator excavator2 = new Excavator(50);
        excavator1.setName("Excavator#2");
        excavator1.setColor("green");
        excavatorList.add(excavator2);
        Excavator excavator3 = new Excavator(70);
        excavator1.setName("Excavator#2");
        excavator1.setColor("yellow");
        excavatorList.add(excavator3);
        return excavatorList;
    }
}
