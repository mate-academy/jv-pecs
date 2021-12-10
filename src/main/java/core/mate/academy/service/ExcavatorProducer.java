package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        firstExcavator.setName("Dodge");
        firstExcavator.setColor("black");
        firstExcavator.setBoom("dodgeBoom");
        firstExcavator.setDipper("dodgeDipper");

        Excavator secondExcavator = new Excavator();
        secondExcavator.setName("Ford");
        secondExcavator.setColor("orange");
        secondExcavator.setBoom("fordBoom");
        secondExcavator.setDipper("fordDipper");

        Excavator thirdExcavator = new Excavator();
        thirdExcavator.setName("Volvo");
        thirdExcavator.setColor("navy");
        thirdExcavator.setBoom("volvoBoom");
        thirdExcavator.setDipper("volvoDipper");

        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(firstExcavator);
        excavatorList.add(secondExcavator);
        excavatorList.add(thirdExcavator);
        return excavatorList;
    }
}
