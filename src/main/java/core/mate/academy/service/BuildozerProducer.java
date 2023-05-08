package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BuildozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer();
        firstBulldozer.setName("John Deere");
        firstBulldozer.setColor("Yellow");
        secondBulldozer.setName("CAT");
        secondBulldozer.setColor("Orange");
        return new ArrayList<>(List.of(firstBulldozer, secondBulldozer));
    }
}

