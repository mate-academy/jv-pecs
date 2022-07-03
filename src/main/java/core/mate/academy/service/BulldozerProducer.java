package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("firstBulldozer", "Green", 3));
        bulldozers.add(new Bulldozer("secondBulldozer", "Yellow", 4));
        bulldozers.add(new Bulldozer("thirdBulldozer", "Red", 5));
        return bulldozers;
    }
}
