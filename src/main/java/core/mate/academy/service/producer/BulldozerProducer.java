package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("U type", true, "Caterpillar LGP", "Yellow"),
                        new Bulldozer("semi-U", false, "Liebherr PR764", "Green"),
                        new Bulldozer("S blade", true, "Cat D8K", "Red"));
    }
}
