package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.suppliers.MachineSupplier;
import core.mate.academy.suppliers.NumberSupplier;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MIN_BULLDOZER_AMOUNT = 1;
    private static final int MAX_BULLDOZER_AMOUNT = 10;
    private MachineSupplier machineSupplier = new MachineSupplier();
    private NumberSupplier numberSupplier = new NumberSupplier();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        int bulldozerAmount = numberSupplier.getRandomIntNumber(MIN_BULLDOZER_AMOUNT,
                MAX_BULLDOZER_AMOUNT);
        for (int i = 0; i < bulldozerAmount; i++) {
            bulldozers.add(machineSupplier.getRandomBulldozer());
        }
        return bulldozers;
    }
}
