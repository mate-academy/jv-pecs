package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozerD4;
    private final Bulldozer bulldozerD5;
    private final Bulldozer bulldozerD6Lgp;

    public BulldozerProducer() {
        bulldozerD4 = new Bulldozer("VPAT", 3.81, 14008);
        bulldozerD4.setName("Cat D4");
        bulldozerD4.setColor("Yellow");
        bulldozerD5 = new Bulldozer("Semi-Universal", 4.3, 17340);
        bulldozerD5.setName("Cat D5");
        bulldozerD5.setColor("Yellow");
        bulldozerD6Lgp = new Bulldozer("Semi-Universal", 5.8, 22870);
        bulldozerD6Lgp.setName("Cat D6");
        bulldozerD6Lgp.setColor("Yellow");
    }

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozerD4, bulldozerD5, bulldozerD6Lgp);
    }
}
