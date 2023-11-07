package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private static final int DEFAULT_BULLDOZER_NUMBER = 5;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < DEFAULT_BULLDOZER_NUMBER; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
