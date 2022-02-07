package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozers = new Bulldozer(25, "yellow", "track");
        Bulldozer secondBulldozers = new Bulldozer(45, "red", "track");
        Bulldozer thirdBulldozers = new Bulldozer(25, "black", "track");
        return List.of(firstBulldozers, secondBulldozers, thirdBulldozers);
    }
}
