package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final Excavator FIRST_EXCAVATOR
            = new Excavator("first excavator", "yellow");
    private static final Excavator SECOND_EXCAVATOR
            = new Excavator("second bulldozer", "black");
    private static final Excavator THIRD_EXCAVATOR
            = new Excavator("third bulldozer", "white");

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(FIRST_EXCAVATOR);
        excavators.add(SECOND_EXCAVATOR);
        excavators.add(THIRD_EXCAVATOR);
        return excavators;
    }
}
