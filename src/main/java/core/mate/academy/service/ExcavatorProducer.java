package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list;

    public ExcavatorProducer() {
        list = new ArrayList<>();
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        Excavator thirdExcavator = new Excavator();

        firstExcavator.setName("first");
        secondExcavator.setName("second");
        thirdExcavator.setName("third");

        firstExcavator.setColor("red");
        secondExcavator.setColor("blue");
        thirdExcavator.setColor("green");
        list.add(firstExcavator);
        list.add(secondExcavator);
        list.add(thirdExcavator);
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
