package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("newBulldozer", "blue", 2));
        bulldozers.add(new Bulldozer("oldBulldozer", "White", 3));
        bulldozers.add(new Bulldozer("mainBulldozer", "Yellow", 5));
        return bulldozers;
    }
}
