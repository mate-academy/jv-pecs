package core.mate.academy.service.machines.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer1", "blue", 1000,
                                        "economy package",32);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer2", "red", 1100,
                                        "ultra package", 36);
        return List.of(bulldozer1, bulldozer2);
    }
}
