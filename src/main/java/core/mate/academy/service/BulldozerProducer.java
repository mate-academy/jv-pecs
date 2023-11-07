package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> consignment = new ArrayList<>();
        for (int i = PRODUCTION_AMOUNT; i > 0; i--) {
            consignment.add(new Bulldozer());
        }
        return consignment;
    }
}
