package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return new ArrayList<>(Arrays.asList(new Excavator("Excavator1", "blue", 123),
                new Excavator("Excavator2", "white", 567),
                new Excavator("Excavator3", "black", 908)));
    }
}
