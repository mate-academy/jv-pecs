package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerFirst = new Bulldozer("Bulldozer 1", "black", 2);
        Bulldozer bulldozerSecond = new Bulldozer("Bulldozer 1", "black", 2);
        Bulldozer bulldozerThird = new Bulldozer("Bulldozer 1", "black", 2);
        List<Bulldozer> bulldozerList = List.of(bulldozerFirst, bulldozerSecond, bulldozerThird);
        return bulldozerList;
    }
}
