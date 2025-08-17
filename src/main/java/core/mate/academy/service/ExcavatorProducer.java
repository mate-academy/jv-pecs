package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator volvo = new Excavator(10, 540, "Volvo", "Orange");
        Excavator lebherr = new Excavator(15, 600, "Liebherr", "Yellow");
        Excavator komatsu = new Excavator(5, 700, "Komatsu", "Blue");
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(volvo);
        excavators.add(lebherr);
        excavators.add(komatsu);
        return excavators;
    }
}
