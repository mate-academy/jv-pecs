package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer{

    @Override
    public List<Excavator> get() {
        Excavator excavatorOne = new Excavator();
        excavatorOne.setName("smallExcavator");
        excavatorOne.setColor("blue");
        excavatorOne.setMaxHeight(5);
        Excavator excavatorTwo = new Excavator();
        excavatorTwo.setName("middleExcavator");
        excavatorTwo.setColor("green");
        excavatorTwo.setMaxHeight(10);
        Excavator excavatorThree = new Excavator();
        excavatorThree.setName("bigExcavator");
        excavatorThree.setColor("blue");
        excavatorThree.setMaxHeight(15);
        ArrayList<Excavator> output = new ArrayList<>();
        output.add(excavatorOne);
        output.add(excavatorTwo);
        output.add(excavatorThree);
        return output;
    }
}
