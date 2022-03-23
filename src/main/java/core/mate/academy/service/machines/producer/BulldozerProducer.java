package core.mate.academy.service.machines.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer1", "blue", "1m x 1m",
                                        "economy package",32);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer2", "red", "1.5m x 1.5m",
                                        "ultra package", 36);
        return List.of(bulldozer1, bulldozer2);
    }
}
