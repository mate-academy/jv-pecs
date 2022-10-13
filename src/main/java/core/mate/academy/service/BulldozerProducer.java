package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        final Bulldozer b1 = new Bulldozer();
        b1.setColor("Blue");
        b1.setName("Ivan");

        final Bulldozer b2 = new Bulldozer();
        b1.setColor("Red");
        b1.setName("Johny");

        final Bulldozer b3 = new Bulldozer();
        b1.setColor("Black");
        b1.setName("Jimmy");

        return List.of(b1, b2, b3);
    }
}
