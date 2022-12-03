package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator #1", "black", 0, "1st field"));
        excavators.add(new Excavator("Excavator #2", "red", 1, "2nd field"));
        excavators.add(new Excavator("Excavator #3", "yellow", 2, "3rd field"));
        return excavators;
    }
    
}
