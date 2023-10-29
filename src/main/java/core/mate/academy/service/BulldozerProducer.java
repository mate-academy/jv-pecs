package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Liebherr multishank", "yellow", "ripper");
        Bulldozer secondBulldozer = new Bulldozer("Caterpillar", "orange", "ripper");
        Bulldozer thirdBulldozer = new Bulldozer("Komatsu", "yellow", "blade");
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
