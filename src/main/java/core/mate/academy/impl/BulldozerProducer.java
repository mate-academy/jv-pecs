package core.mate.academy.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int AMOUNT_OF_MACHINE_TO_CREATE = 3;
    private static final double BULLDOZER_BLADE_LENGTH = 4500;
    private static final double BULLDOZER_BLADE_MASS = 15;
    private static final double BULLDOZER_ROCK_MOVEMENT_DISTANCE = 100;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_MACHINE_TO_CREATE; i++) {
            bulldozers.add(getDefaultBulldozer());
        }
        return bulldozers;
    }

    private Bulldozer getDefaultBulldozer() {
        return new Bulldozer(BULLDOZER_BLADE_LENGTH,
                BULLDOZER_BLADE_MASS,
                BULLDOZER_ROCK_MOVEMENT_DISTANCE);
    }
}
