package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorFirst = new Excavator();
        excavatorFirst.setColor("Yellow");
        excavatorFirst.setName("Komatsu");

        Excavator excavatorSecond = new Excavator();
        excavatorSecond.setColor("Green");
        excavatorSecond.setName("Liebherr");

        Excavator excavatorThird = new Excavator();
        excavatorThird.setColor("Black");
        excavatorThird.setName("Volvo");

        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavatorFirst);
        excavatorList.add(excavatorSecond);
        excavatorList.add(excavatorThird);

        return excavatorList;
    }
}
