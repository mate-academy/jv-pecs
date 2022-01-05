package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    static final Excavator caterpillar = new Excavator("caterpillar", "yellow");
    static final Excavator comatsu = new Excavator("comatsu", " yellow");
    static final Excavator belaz = new Excavator("belaz", " grey");

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(caterpillar);
        excavators.add(comatsu);
        excavators.add(belaz);
        return excavators;
    }
}
