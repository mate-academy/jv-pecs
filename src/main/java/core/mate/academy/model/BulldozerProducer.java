package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer firstBulldozer = new Bulldozer(500);
        firstBulldozer.setName("First bulldozer");
        firstBulldozer.setColor("Yellow");
        bulldozers.add(firstBulldozer);
        Bulldozer secondBulldozer = new Bulldozer(600);
        secondBulldozer.setName("Second bulldozer");
        secondBulldozer.setColor("Red");
        bulldozers.add(secondBulldozer);
        return bulldozers;
    }
}
