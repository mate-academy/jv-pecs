package core.mate.academy.service.machineproducerimpl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MAX_BULLDOZER_QUANTITY = 5;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersPark = new ArrayList<>();
        for (int i = 0; i < MAX_BULLDOZER_QUANTITY; i++) {
            bulldozersPark.add(new Bulldozer());
        }
        return bulldozersPark;
    }
}
