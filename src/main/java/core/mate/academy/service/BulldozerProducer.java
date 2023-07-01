package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setName("firstBulldozer");
        firstBulldozer.setColor("Yellow");
        bulldozers.add(firstBulldozer);

        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setName("secondBulldozer");
        secondBulldozer.setColor("Blue");
        bulldozers.add(secondBulldozer);

        Bulldozer thirdBulldozer = new Bulldozer();
        thirdBulldozer.setName("thirdBulldozer");
        thirdBulldozer.setColor("PerfectBlue");
        bulldozers.add(thirdBulldozer);

        return bulldozers;
    }
}
