package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        Bulldozer bulldozerTwo = new Bulldozer();
        Bulldozer bulldozerThree = new Bulldozer();
        return List.of(bulldozerOne, bulldozerTwo, bulldozerThree);
    }
}
