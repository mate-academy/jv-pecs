package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Caterpillar", "red", 500));
        excavators.add(new Excavator("Crawler", "green", 700));
        excavators.add(new Excavator("John Deere", "yellow", 600));
        return excavators;
    }
}
