package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator();
        excavatorOne.setBoomType("Standart");
        excavatorOne.setCounterWeight(800);
        excavatorOne.setName("Volvo");
        excavatorOne.setColor("Red");
        Excavator excavatorTwo = new Excavator();
        excavatorTwo.setBoomType("Long-Reach Boom");
        excavatorTwo.setCounterWeight(1400);
        excavatorTwo.setName("Volvo");
        excavatorTwo.setColor("Yellow");
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavatorOne);
        excavatorList.add(excavatorTwo);
        return excavatorList;
    }
}
