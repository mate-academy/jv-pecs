package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer("Bulldozer-1",
                "Yellow",15000,"Mini Bulldozer");
        Bulldozer secondBulldozer = new Bulldozer("Bulldozer-2",
                "White",50000,"Wheel Bulldozer");
        Bulldozer thirdBulldozer = new Bulldozer("Bulldozer-3",
                "Red",25000,"Crawler Bulldozer");
        return List.of(firstBulldozer,secondBulldozer,thirdBulldozer);
    }
}
