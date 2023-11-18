package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int EXCAVATOR_COUNT = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> listOfExcavators = new ArrayList<>();
        for (int i = 0; i < EXCAVATOR_COUNT; i++) {
            listOfExcavators.add(new Excavator("Excavator", "Yellow",
                    "Diesel", 250));
        }
        return listOfExcavators;
    }
}
