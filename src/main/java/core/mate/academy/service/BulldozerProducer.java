package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        final Bulldozer bulldozer1 = new Bulldozer("T-191", "yellow", "S-Blade");
        final Bulldozer bulldozer2 = new Bulldozer("S-500", "orange", "U-Blade");
        final Bulldozer bulldozer3 = new Bulldozer("SD-501", "brown", "Semi-U");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
