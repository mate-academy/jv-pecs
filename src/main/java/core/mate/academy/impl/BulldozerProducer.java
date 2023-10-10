package core.mate.academy.impl;

import static core.mate.academy.MachineSupplier.DEFAULT_AMOUNT_OF_MACHINE_TO_CREATE;

import core.mate.academy.MachineSupplier;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final MachineSupplier machineSupplier = new MachineSupplier();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < DEFAULT_AMOUNT_OF_MACHINE_TO_CREATE; i++) {
            bulldozers.add(machineSupplier.getDefaultBulldozer());
        }
        return bulldozers;
    }
}
