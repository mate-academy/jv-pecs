package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    private Bulldozer firstBulldozer = new Bulldozer("Road", "Orange", 12, false);
    private Bulldozer secondBulldozer = new Bulldozer("Construct", "Red", 22, true);
    private Bulldozer thirdBulldozer = new Bulldozer("Additional", "Yellow", 18, true);

    @Override
    public List get() {
        return List.of(firstBulldozer,secondBulldozer, thirdBulldozer);
    }
}
