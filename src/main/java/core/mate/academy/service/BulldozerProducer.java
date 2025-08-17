package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerD4 = new Bulldozer("Cat D4", "Yellow", "VPAT", 3.81, 14008);
        Bulldozer bulldozerD5 = new Bulldozer("Cat D5", "Yellow","Semi-Universal", 4.3, 17340);
        Bulldozer bulldozerD6Lgp = new Bulldozer("Cat D6LGP", "Yellow", "Semi-Universal",
                5.8, 22870);
        return List.of(bulldozerD4, bulldozerD5, bulldozerD6Lgp);
    }
}
