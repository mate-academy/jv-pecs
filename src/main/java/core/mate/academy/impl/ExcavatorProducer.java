package core.mate.academy.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int AMOUNT_OF_MACHINE_TO_CREATE = 3;
    private static final String EXCAVATOR_ACTION_PRINCIPLE = "Drag-line";
    private static final String EXCAVATOR_POWER_EQUIPMENT_TYPE = "Electric";
    private static final String EXCAVATOR_MOVING_EQUIPMENT_TYPE = "Pneumatic wheels";

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_MACHINE_TO_CREATE; i++) {
            excavators.add(getDefaultExcavator());
        }
        return excavators;
    }

    private Excavator getDefaultExcavator() {
        return new Excavator(EXCAVATOR_ACTION_PRINCIPLE,
                EXCAVATOR_POWER_EQUIPMENT_TYPE,
                EXCAVATOR_MOVING_EQUIPMENT_TYPE);
    }
}
