package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final String BULLDOZER_NAME_1 = "Shaulin";
    private static final String BULLDOZER_NAME_2 = "Herbatiy";
    private static final String BULLDOZER_COLOR_1 = "RED";
    private static final String BULLDOZER_COLOR_2 = "BLUE";
    private static final double BULLDOZER_WEIGHT_1 = 85.1;
    private static final double BULLDOZER_WEIGHT_2 = 123.4;
    private static final double BULLDOZER_LENGTH_1 = 15.4;
    private static final double BULLDOZER_LENGTH_2 = 18.3;

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(BULLDOZER_NAME_1, BULLDOZER_COLOR_1,
                BULLDOZER_WEIGHT_1, BULLDOZER_LENGTH_1);
        Bulldozer bulldozer2 = new Bulldozer(BULLDOZER_NAME_2, BULLDOZER_COLOR_2,
                BULLDOZER_WEIGHT_2, BULLDOZER_LENGTH_2);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
