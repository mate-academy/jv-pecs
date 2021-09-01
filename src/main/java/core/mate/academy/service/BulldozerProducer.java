package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer(false, true, "CatLGP", "Yellow"),
                new Bulldozer(false, false, "LiebherrPR734", "Green"),
                new Bulldozer(true, true, "CatC15", "Red"));
    }
}
