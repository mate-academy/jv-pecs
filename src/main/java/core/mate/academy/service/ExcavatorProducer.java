package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Excavator1", "black","randomValue2",
                "randomValue4",8);
        Excavator excavator2 = new Excavator("Excavator2", "red","randomValue3",
                "randomValue9",27);
        Excavator excavator3 = new Excavator("Excavator3", "white","randomValue4",
                "randomValue16",64);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;

    }

}
