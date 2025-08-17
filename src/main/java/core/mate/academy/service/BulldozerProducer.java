package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers;

    {
        Bulldozer bulldozerFirst = new Bulldozer("BulldozerFirst", "White", 50);
        Bulldozer bulldozerSecond = new Bulldozer("BulldozerSecond", "Black", 65);
        Bulldozer bulldozerThird = new Bulldozer("BulldozerThird", "Orange", 35);
        bulldozers = List.of(bulldozerFirst, bulldozerSecond, bulldozerThird);
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
