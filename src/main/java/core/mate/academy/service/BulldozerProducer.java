package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer first = new Bulldozer(1000, 2012);
        first.setName("TomCat");
        first.setColor("Yellow");
        Bulldozer second = new Bulldozer(1500, 2016);
        second.setName("Dig");
        second.setColor("White");
        Bulldozer third = new Bulldozer(1200, 2019);
        third.setName("JCB");
        third.setColor("Black");
        return List.of(first, second, third);
    }
}
