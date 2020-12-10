package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("First Bulldozer", "I'm red", "Levitation", "Let's do it!"),
                new Bulldozer("Secret Bulldozer", "Transparent", "Invisible", "Look at me!"),
                new Bulldozer("Super Bulldozer", "All", "Chuck Norris", "WTF?"));
    }
}
