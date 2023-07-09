package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Machine> get() {
        final Machine bulldozer1 = new Bulldozer("Ukraine",2023,"General purpose",
                "Yellow");
        final Machine bulldozer2 = new Bulldozer("USA",2014,"Specialized",
                "Blu");
        final Machine bulldozer3 = new Bulldozer("Poland",2019,"Adapted","Red");
        return List.of(bulldozer1,bulldozer2,bulldozer3);
    }
}
