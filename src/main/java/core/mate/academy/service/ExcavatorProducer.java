package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("excavator1", "yellow", "Digging", "Mono"));
        excavators.add(new Excavator("excavator2", "red", "Rock", "Two-piece"));
        excavators.add(new Excavator("excavator3", "black", "Clean-up", "Long-reach"));
        return excavators;
    }
}
