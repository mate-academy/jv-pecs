package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer komatsuBulldozer = new Bulldozer("D39EX-24", "yellow", "PAT", "center panel",
                228.2137,9.5254, 36128.53);
        Bulldozer shantuiBulldozer = new Bulldozer("SD90-C5 RS", "orange", "Semi-U",
                "back, bottom corners of the blade", 1638, 106260, 143700);
        Bulldozer caterpillarBulldozer = new Bulldozer("Cat C7.1", "yellow", "LGP VPAT",
                "center panel", 315, 19170, 32600);
        return List.of(komatsuBulldozer, shantuiBulldozer, caterpillarBulldozer);
    }
}
