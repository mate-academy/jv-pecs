package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerFirst = new Bulldozer("bulldozerFirst", "yellow", "O");
        Bulldozer bulldozerSecond = new Bulldozer("bulldozerSecond", "green", "W");
        Bulldozer bulldozerThird = new Bulldozer("bulldozerThird", "blue", "Z");
        return List.of(bulldozerFirst, bulldozerSecond, bulldozerThird);
    }
}
