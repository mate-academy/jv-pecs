package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
public List<Bulldozer> get() {
        Bulldozer komatsuBulldozer = new Bulldozer("Komatsu", "diesel",58);
        Bulldozer liebherrBulldozer = new Bulldozer("Liebherr", "HVO", 350);
        Bulldozer caterpillarBulldozer = new Bulldozer("Caterpillar","diesel",1471);
        return List.of(komatsuBulldozer, liebherrBulldozer, caterpillarBulldozer);
    }
}
