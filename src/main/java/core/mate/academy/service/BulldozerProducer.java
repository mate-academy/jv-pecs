package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "yellow","track",500));
        bulldozers.add(new Bulldozer("Liebherr", "red", "wheeled", 750));
        bulldozers.add(new Bulldozer("Komatsu", "green", "wheeled", 350));
        return bulldozers;
    }
}
