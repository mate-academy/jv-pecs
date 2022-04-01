package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("S-Blade"),
                new Bulldozer("U-Blade"), new Bulldozer("S-U-Blade"));
    }
}
