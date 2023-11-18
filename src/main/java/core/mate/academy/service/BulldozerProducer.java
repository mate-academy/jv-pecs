package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int BULLDOZER_COUNT = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        for (int i = 0; i < BULLDOZER_COUNT; i++) {
            listOfBulldozers.add(new Bulldozer("Bulldozer", "Grey",
                    55, "Manual"));
        }
        return listOfBulldozers;
    }
}
