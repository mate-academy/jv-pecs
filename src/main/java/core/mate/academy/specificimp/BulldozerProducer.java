package core.mate.academy.specificimp;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_BULLDOZERS = 10;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_BULLDOZERS; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
