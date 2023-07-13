package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<E> implements MachineProducer<E> {
    @Override
    public List<? extends Machine> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setColor("red");
        firstExcavator.setName("JCB");
        firstExcavator.setBucketVolume(2.49);

        Excavator secondExcavator = new Excavator();
        secondExcavator.setColor("yellow");
        secondExcavator.setName("Terex");
        secondExcavator.setBucketVolume(2.91);

        Excavator thirdExcavator = new Excavator();
        thirdExcavator.setColor("blue");
        thirdExcavator.setName("Caterpillar");
        thirdExcavator.setBucketVolume(1.6);

        ArrayList<Excavator> excavators = new ArrayList<>();
        excavators.add(firstExcavator);
        excavators.add(secondExcavator);
        excavators.add(thirdExcavator);
        return excavators;
    }
}
