package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer(5000, 7000, 3000, 30);
        firstBulldozer.setName("Bulldozer1");
        firstBulldozer.setColor("White");
        Bulldozer secondBulldozer = new Bulldozer(4000, 6000, 2000, 20);
        secondBulldozer.setName("Bulldozer2");
        secondBulldozer.setColor("Orange");
        List<Bulldozer> list = List.of(firstBulldozer, secondBulldozer);
        return list;
    }
}
