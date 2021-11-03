package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("first bulldozer", "yellow"));
        excavators.add(new Excavator("second bulldozer", "black"));
        excavators.add(new Excavator("third bulldozer", "white"));
        return excavators;
    }
}
