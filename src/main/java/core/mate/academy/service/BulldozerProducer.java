package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        Bulldozer ural = new Bulldozer("Ural", "Green", 500, "zavodUralMash");
        Bulldozer cat = new Bulldozer("CAT", "Yellow", 300, "factoryFrancfurt");
        Bulldozer amcodor = new Bulldozer("Amcodor", "Orange", 700, "ZaporizzyaFactory");
        return List.of(ural, cat, amcodor);
    }
}
