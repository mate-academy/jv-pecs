package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final String BULLDOZER_NAME_1 = "CAT";
    private static final String BULLDOZER_NAME_2 = "Shantui";
    private static final String BULLDOZER_COLOR_1 = "Yellow";
    private static final String BULLDOZER_COLOR_2 = "Grey";
    private static final double BULLDOZER_WEIGHT_1 = 19.4;
    private static final double BULLDOZER_WEIGHT_2 = 15.8;
    private static final String BULLDOZER_MODEL_1 = "963 B";
    private static final String BULLDOZER_MODEL_2 = "SD";

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(BULLDOZER_NAME_1, BULLDOZER_COLOR_1,
                BULLDOZER_WEIGHT_1, BULLDOZER_MODEL_1);
        Bulldozer bulldozer2 = new Bulldozer(BULLDOZER_NAME_2, BULLDOZER_COLOR_2,
                BULLDOZER_WEIGHT_2, BULLDOZER_MODEL_2);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
