package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return new ArrayList<>(List.of(
                new Bulldozer("Cat", "yellow", "randomModel"),
                new Bulldozer("Cat", "Blue", "randomModel2"),
                new Bulldozer("Volvo", "Green", "randomModel3")
        ));
    }
}
