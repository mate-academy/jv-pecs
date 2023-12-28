package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(firstBulldozer);
        return bulldozers;
    }
}
