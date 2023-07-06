package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();

        String name1 = "firstExcavator";
        String color1 = "Yellow";
        Excavator firstExcavator = new Excavator(name1, color1);
        excavators.add(firstExcavator);

        String name2 = "secondExcavator";
        String color2 = "Blue";
        Excavator secondExcavator = new Excavator(name2, color2);
        excavators.add(secondExcavator);

        String name3 = "thirdExcavator";
        String color3 = "PerfectBlue";
        Excavator thirdExcavator = new Excavator(name3, color3);
        excavators.add(thirdExcavator);

        return excavators;
    }
}
