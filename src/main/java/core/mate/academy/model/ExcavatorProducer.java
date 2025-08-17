package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        final Excavator caterpillar = new Excavator("caterpillar", "yellow");
        final Excavator comatsu = new Excavator("comatsu", " yellow");
        final Excavator belaz = new Excavator("belaz", " grey");
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(caterpillar);
        excavators.add(comatsu);
        excavators.add(belaz);
        return excavators;
    }
}
