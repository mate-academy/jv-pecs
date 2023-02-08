package core.mate.academy.producer;


import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setBoomType("Standart");
        excavator1.setCounterWeight(800);
        excavator1.setName("Volvo");
        excavator1.setColor("Red");
        Excavator excavator2 = new Excavator();
        excavator2.setBoomType("Long-Reach Boom");
        excavator2.setCounterWeight(1400);
        excavator2.setName("Volvo");
        excavator2.setColor("Yellow");
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        return excavatorList;
    }
}
