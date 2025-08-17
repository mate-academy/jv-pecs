package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> getListMachines() {
        return List.of(new Bulldozer(2),
                new Bulldozer(4));
    }
}
