package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Tsingtao", "yellow", 1));
        excavators.add(new Excavator("VeseliyGrobokopatel", "rainbow", 3));
        excavators.add(new Excavator("MrWhite", "black", 8));
        return excavators;
    }
}
