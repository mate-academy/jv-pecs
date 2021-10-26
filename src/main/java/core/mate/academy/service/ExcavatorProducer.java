package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("John Deer", "black", 35);
    private Excavator excavator2 = new Excavator("Komatsu PC300-8", "yellow", 25);
    private Excavator excavator3 = new Excavator("Hyundai R300LC-9S", "green", 45);

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
