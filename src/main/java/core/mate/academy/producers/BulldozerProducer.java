package core.mate.academy.producers;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(getRandomNum(), getRandomNum()),
                new Bulldozer(getRandomNum(), getRandomNum()));
    }
}
