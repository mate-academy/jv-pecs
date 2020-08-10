package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<>();
        bulldozer.add(new Bulldozer(2000, 30));
        bulldozer.add(new Bulldozer(1300, 60));
        bulldozer.add(new Bulldozer(1450, 65));
        return bulldozer;
    }
}
