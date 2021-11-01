package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer caterpillar = new Bulldozer("U type", true, "Caterpillar LGP", "Yellow");
    private Bulldozer liebherr = new Bulldozer("semi-U", false, "Liebherr PR764", "Green");
    private Bulldozer cat = new Bulldozer("S blade", true, "Cat D8K", "Red");

    @Override
    public List<Bulldozer> get() {
        return List.of(caterpillar, liebherr, cat);
    }
}
