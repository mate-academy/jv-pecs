package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerFirst = new Bulldozer();
        Bulldozer bulldozerSecond = new Bulldozer();
        Bulldozer bulldozerThird = new Bulldozer();
        Bulldozer bulldozerFourth = new Bulldozer();
        List<Bulldozer> bulldozerList = List.of(bulldozerFirst, bulldozerSecond,
                bulldozerThird, bulldozerFourth);
        return bulldozerList;
    }
}
