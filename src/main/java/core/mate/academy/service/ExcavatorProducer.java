package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final String EXCAVATOR_NAME_1 = "Jekky";
    private static final String EXCAVATOR_NAME_2 = "Oliver";
    private static final String EXCAVATOR_COLOR_1 = "Orange";
    private static final String EXCAVATOR_COLOR_2 = "Black";
    private static final int EXCAVATOR_POWER_1 = 155;
    private static final int EXCAVATOR_POWER_2 = 98;
    private static final double EXCAVATOR_SCOOP_VOLUME_1 = 19;
    private static final double EXCAVATOR_SCOOP_VOLUME_2 = 34;

    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(EXCAVATOR_NAME_1, EXCAVATOR_COLOR_1,
                EXCAVATOR_POWER_1, EXCAVATOR_SCOOP_VOLUME_1);
        Excavator excavator2 = new Excavator(EXCAVATOR_NAME_2, EXCAVATOR_COLOR_2,
                EXCAVATOR_POWER_2, EXCAVATOR_SCOOP_VOLUME_2);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
