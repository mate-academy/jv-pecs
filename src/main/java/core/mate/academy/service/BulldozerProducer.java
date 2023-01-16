package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer(33,"Straight");
        Bulldozer bulldozer2 = new Bulldozer(22,"Angle");
        Bulldozer bulldozer3 = new Bulldozer(44,"Cutter");
        return List.of(bulldozer1,bulldozer2,bulldozer3);
    }
}
