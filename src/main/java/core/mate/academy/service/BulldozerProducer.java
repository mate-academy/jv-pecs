package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        Bulldozer bull1 = new Bulldozer("type1", 1);
        Bulldozer bull2 = new Bulldozer("type2", 2);
        Bulldozer bull3 = new Bulldozer("type3", 3);
        return List.of(bull1, bull2, bull3);
    }
}
