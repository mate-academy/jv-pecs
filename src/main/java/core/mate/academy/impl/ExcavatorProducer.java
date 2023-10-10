package core.mate.academy.impl;

import static core.mate.academy.MachineSupplier.DEFAULT_AMOUNT_OF_MACHINE_TO_CREATE;

import core.mate.academy.MachineSupplier;
import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final MachineSupplier machineSupplier = new MachineSupplier();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < DEFAULT_AMOUNT_OF_MACHINE_TO_CREATE; i++) {
            excavators.add(machineSupplier.getDefaultExcavator());
        }
        return excavators;
    }
}
