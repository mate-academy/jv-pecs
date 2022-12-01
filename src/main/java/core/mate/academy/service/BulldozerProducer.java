package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer();
        Bulldozer bulldozerTwo = new Bulldozer(140, 10, "T-130");
        Bulldozer bulldozerThree = new Bulldozer(160, 8, "T-170");
        return List.of(bulldozerOne, bulldozerTwo, bulldozerThree);
    }
}
