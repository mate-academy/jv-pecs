package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer("bull b1", "black", 1000);
        Bulldozer bulldozerSecond = new Bulldozer("dozer d1", "red", 1500);
        Bulldozer bulldozerThird = new Bulldozer("super dozer sd3", "white", 200);
        return List.of(bulldozerOne, bulldozerSecond, bulldozerThird);
    }
}
