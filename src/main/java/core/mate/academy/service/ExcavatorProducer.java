package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator();
        excavatorOne.setName("ExcavatorOne");
        excavatorOne.setColor("Black");
        Excavator excavatorTwo = new Excavator();
        excavatorTwo.setName("ExcavatorTwo");
        excavatorTwo.setColor("Red");
        Excavator excavatorThree = new Excavator();
        excavatorThree.setName("ExcavatorThree");
        excavatorThree.setColor("Green");
        return List.of(excavatorOne, excavatorTwo, excavatorThree);
    }
}
