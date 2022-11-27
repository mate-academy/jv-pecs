package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("Jekky", "Orange",
                155, 19);
        Excavator excavator2 = new Excavator("Oliver", "Black",
                98, 34);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
