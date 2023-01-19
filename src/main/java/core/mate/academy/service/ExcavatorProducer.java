package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavatorsList;

    public ExcavatorProducer() {
        excavatorsList = new ArrayList<>();
        excavatorsList.add(new Excavator("First", "yellow", 400.0, "First Brand", 40));
        excavatorsList.add(new Excavator("Second", "green", 350.0, "Second Brand", 35));
        excavatorsList.add(new Excavator("Third", "brown", 430.0, "Third Brand", 45));
    }

    @Override
    public List<Excavator> get() {
        return excavatorsList;
    }
}
