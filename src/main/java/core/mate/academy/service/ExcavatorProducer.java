package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final String EXCAVATOR_NAME_1 = "Volvo";
    private static final String EXCAVATOR_NAME_2 = "JCB";
    private static final String EXCAVATOR_NAME_3 = "CAT";
    private static final String EXCAVATOR_COLOR_1 = "Yellow";
    private static final String EXCAVATOR_COLOR_2 = "Grey";
    private static final String EXCAVATOR_COLOR_3 = "Braun";
    private static final double EXCAVATOR_SCOOP_VOLUME_1 = 0.76;
    private static final double EXCAVATOR_SCOOP_VOLUME_2 = 0.84;
    private static final double EXCAVATOR_SCOOP_VOLUME_3 = 0.68;
    private static final int EXCAVATOR_POWER_1 = 145;
    private static final int EXCAVATOR_POWER_2 = 176;
    private static final int EXCAVATOR_POWER_3 = 121;
    private static final int EXCAVATOR_WEIGHT_1 = 18250;
    private static final int EXCAVATOR_WEIGHT_2 = 19300;
    private static final int EXCAVATOR_WEIGHT_3 = 15700;

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(EXCAVATOR_NAME_1, EXCAVATOR_COLOR_1,
                EXCAVATOR_SCOOP_VOLUME_1, EXCAVATOR_POWER_1, EXCAVATOR_WEIGHT_1);
        Excavator excavator2 = new Excavator(EXCAVATOR_NAME_2, EXCAVATOR_COLOR_2,
                EXCAVATOR_SCOOP_VOLUME_2, EXCAVATOR_POWER_2, EXCAVATOR_WEIGHT_2);
        Excavator excavator3 = new Excavator(EXCAVATOR_NAME_3, EXCAVATOR_COLOR_3,
                EXCAVATOR_SCOOP_VOLUME_3, EXCAVATOR_POWER_3, EXCAVATOR_WEIGHT_3);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
