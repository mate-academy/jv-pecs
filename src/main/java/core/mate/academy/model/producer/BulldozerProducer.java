package core.mate.academy.model.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int AMOUNT_TO_GET = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_GET; i++) {
            bulldozersList.add(new Bulldozer());
        }
        return bulldozersList;
    }
}
