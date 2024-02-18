package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        var firstBulldozer = new Bulldozer("First Bulldozer", "White", "ripper");
        var secondBulldozer = new Bulldozer("Second Bulldozer", "Black", "ripper");
        return List.of(firstBulldozer, secondBulldozer);
    }
}
