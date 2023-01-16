package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Bulldozer firstBulldozer = new Bulldozer(33,"Straight");
        Bulldozer secondBulldozer = new Bulldozer(22,"Angle");
        Bulldozer thirdBulldozer = new Bulldozer(44,"Cutter");
        return List.of(firstBulldozer,secondBulldozer,thirdBulldozer);
    }
}
