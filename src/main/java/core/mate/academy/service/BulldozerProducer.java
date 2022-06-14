package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.LinkedList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Caterpillar 21", "Yellow", 3000, 1000);
        Bulldozer secondBulldozer = new Bulldozer("Caterpillar 45", "Yellow", 4000, 1500);
        List<Bulldozer> bulldozers = new LinkedList<>();
        bulldozers.add(firstBulldozer);
        bulldozers.add(secondBulldozer);
        return bulldozers;
    }
}
