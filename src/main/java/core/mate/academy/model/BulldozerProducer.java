package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<>();
        bulldozer.add(new Bulldozer("wheeled bulldozer"));
        bulldozer.add(new Bulldozer("tracked bulldozer"));

        return bulldozer;
    }
}
