package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    public static final List<Excavator> EXCAVATOR_ARRAY_LIST = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setName("Dodge");
        firstExcavator.setColor("black");
        firstExcavator.setBoom("dodgeBoom");
        firstExcavator.setDipper("dodgeDipper");
        EXCAVATOR_ARRAY_LIST.add(firstExcavator);
        Excavator secondExcavator = new Excavator();
        secondExcavator.setName("Ford");
        secondExcavator.setColor("orange");
        secondExcavator.setBoom("fordBoom");
        secondExcavator.setDipper("fordDipper");
        EXCAVATOR_ARRAY_LIST.add(secondExcavator);
        Excavator thirdExcavator = new Excavator();
        thirdExcavator.setName("Volvo");
        thirdExcavator.setColor("navy");
        thirdExcavator.setBoom("volvoBoom");
        thirdExcavator.setDipper("volvoDipper");
        EXCAVATOR_ARRAY_LIST.add(thirdExcavator);
        return EXCAVATOR_ARRAY_LIST;
    }
}
