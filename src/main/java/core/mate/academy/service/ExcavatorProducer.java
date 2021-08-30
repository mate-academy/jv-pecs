package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(10, 540, "Volvo", "Orange");
        Excavator excavator2 = new Excavator(15, 600, "Liebherr", "Yellow");
        Excavator excavator3 = new Excavator(5, 700, "Komatsu", "Blue");
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
