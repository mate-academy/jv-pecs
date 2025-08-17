package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.suppliers.MachineSupplier;
import core.mate.academy.suppliers.NumberSupplier;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MIN_EXCAVATOR_AMOUNT = 1;
    private static final int MAX_EXCAVATOR_AMOUNT = 10;
    private MachineSupplier machineSupplier = new MachineSupplier();
    private NumberSupplier numberSupplier = new NumberSupplier();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        int excavatorAmount = numberSupplier.getRandomIntNumber(MIN_EXCAVATOR_AMOUNT,
                MAX_EXCAVATOR_AMOUNT);
        for (int i = 0; i < excavatorAmount; i++) {
            excavators.add(machineSupplier.getRandomExcavator());
        }
        return excavators;
    }
}
